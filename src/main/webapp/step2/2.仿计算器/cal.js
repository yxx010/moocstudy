function init() {
    var num=document.getElementById("num");
    num.value=2;
    num.disabled="disabled";
    var oButton=document.getElementsByTagName("input");
    for (var i=0;i<oButton.length;i++){
        oButton[i].onclick=function(){
            if(isNumber(this.value)){
                alert("数字");
            }else{
                alert("非数字");

            }
        }
    }
}
function isNumber(n) {
    return !isNaN(n);
}