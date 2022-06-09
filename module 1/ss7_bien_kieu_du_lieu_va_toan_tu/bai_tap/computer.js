

function mutiplication( ){
    var number_1 = document.getElementById("e").value;
    var number_2 = document.getElementById("f").value;
    var caculation;

    caculation = number_1 * number_2;

    return document.getElementById("ketqua").innerHTML = caculation;
}

function subtraction() {
    var number_1 = document.getElementById("e").value;
    var number_2 = document.getElementById("f").value;
    number_1 = parseInt(number_1)
    number_2 = parseInt(number_2)
    var caculation;

    caculation = number_1 - number_2;

    return document.getElementById("ketqua").innerHTML = caculation;

}

function addition() {
    var number_1 = document.getElementById("e").value;
    var number_2 = document.getElementById("f").value;
    number_1 = parseInt(number_1)
    number_2 = parseInt(number_2)
    var caculation;

    caculation = number_1 + number_2;

    return document.getElementById("ketqua").innerHTML = caculation;

}

function division(){
    var number_1 = document.getElementById("e").value;
    var number_2 = document.getElementById("f").value;
    var caculation;

    caculation = number_1 / number_2;

    return document.getElementById("ketqua").innerHTML = caculation;

}

