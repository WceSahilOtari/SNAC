package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

public class motivational_quotes extends AppCompatActivity
{
 TextView quoteTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational_quotes);
       quoteTextView = findViewById(R.id.quoteTextView) ;
       loadQuote(quoteTextView);
    }

    public void loadQuote(View view)
    {
        RequestQueue queue = Volley.newRequestQueue(this) ;
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, "https://zenquotes.io/api/random/[your_key]", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response)
            {
                JSONObject obj ;
                try {
                    obj = (JSONObject) response.get(0);
                    String quote = obj.getString("q");
                    if (!quote.equals("Too many requests. Obtain an auth key for unlimited access."))
                        quoteTextView.setText(quote);
                    else loadQuote(view);
                } catch (Exception e)
                {
                    quoteTextView.setText("Something went Wrong !");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) ;

        queue.add(jsonArrayRequest) ;
    }
}