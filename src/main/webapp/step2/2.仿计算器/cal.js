function init() {
    var num=document.getElementById("num");
    num.value=0;
    num.disabled="disabled";
    var oButton=document.getElementsByTagName("input");
    for (var i=0;i<oButton.length;i++){
        oButton[i].onclick=function(){
            if(isNumber(this.value)){
                //alert("数字");
                //方法一：
                if (isNull(num.value))
                {
                    num.value=this.value;
                }
                else{
                    num.value=num.value+this.value;
                }
                //方法二：
                //num.value=(num.value+this.value)*1;

            }else{
                //alert("非数字");
                var btn_num=this.value;
                //alert(btn_num);
                switch (btn_num) {
                    case "+":
                        break
                    case "-":
                        break;
                    case "*":
                        break;
                    case "/":
                        break;
                    case ".":
                        break;
                    case "c":
                        break;
                }
            }
        }
    }
}
function isNumber(n) {
    return !isNaN(n);
}
function isNull(n) {
    //if((n=="0"||n.length==0))
    //{return true;}else{
    //    return false;
    //}

    return ((n=="0"||n.length==0));
    /*{return true;}else{
        return false;
    }*/

}