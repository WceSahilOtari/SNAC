package com.example.prana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class chat extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        WebView chatWebView = findViewById(R.id.chatWebView) ;
        chatWebView.getSettings().setJavaScriptEnabled(true);
        chatWebView.setFocusable(true) ;
        chatWebView.onCheckIsTextEditor() ;
        chatWebView.setFocusableInTouchMode(true) ;
        chatWebView.setWebChromeClient(new WebChromeClient());
        chatWebView.loadUrl("https://pranachat.herokuapp.com");
    }
}