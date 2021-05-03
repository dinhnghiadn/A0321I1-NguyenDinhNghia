function cong() {
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    sum = a + b;
    document.getElementById("bt").innerText = "Tong "+a+ "+" +b+" la: " +sum;
}
function tru() {
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    sub = a - b;
    document.getElementById("bt").innerText = "Hieu "+a+ "-" +b+" la: " +sub;
}
function nhan() {
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    mul = a * b;
    document.getElementById("bt").innerText = "Tich "+a+ "*" +b+" la: " +mul;
}
function chia() {
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    div = a/b;
    document.getElementById("bt").innerText = "Thuong "+a+ "/" +b+" la: " +div;
}