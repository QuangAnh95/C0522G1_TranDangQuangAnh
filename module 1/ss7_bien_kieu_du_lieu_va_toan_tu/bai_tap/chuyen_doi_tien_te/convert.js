function convertMoney(){
    var amount = document.getElementById("a").value;
    var from = document.getElementById("b").value;
    var to = document.getElementById("c").value;
    var money;

    if(from === "VND" && to === "USD"){
        money = amount/23000;
        document.getElementById("result").innerHTML ="Result: " + money + " USD";
    }
    else if (from === "USD" && to === "VND"){
        money = amount*23000;
        document.getElementById("result").innerHTML ="Result: " + money + " VND";
    }
    else{
        alert("From Currency phải khác To Currency")
    }
}




