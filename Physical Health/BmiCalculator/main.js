function calculateBmi() {
    var weight = document.techBMI.weight.value
    var height = document.techBMI.height.value
    if(weight > 0 && height > 0){	
    var finalBmi = weight/(height*height)
    document.techBMI.bmi.value = finalBmi.toFixed(3);
    if(finalBmi < 18.5){
    document.techBMI.meaning.value = "You are unhealthy, too thin."
        }
    if(finalBmi > 18.5 && finalBmi < 25){
    document.techBMI.meaning.value = "You are healthy enough."
        }
    if(finalBmi > 25 &&  finalBmi <30){
    document.techBMI.meaning.value = "You have overweight."
        }
    if(finalBmi > 30){
    document.techBMI.meaning.value = "Your condition is serious."
        }
        }
        else{
        alert("Data you've entered might be incorrect. Please check and try again.")
        }
    
        }