function init() {
    var num=document.getElementById("num");
    num.value=0;
    num.disabled="disabled";
    var oButton=document.getElementsByTagName("input");
    var tempNum;
    var fh;
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
                        //alert("+");
                        tempNum=num.value*1;
                        num.value=0;
                        fh="+";
                        break;
                    case "-":
                        tempNum=num.value*1;
                        num.value=0;
                        fh="-";
                        break;
                    case "*":
                        tempNum=num.value*1;
                        num.value=0;
                        fh="*";
                        break;
                    case "/":
                        tempNum=num.value*1;
                        num.value=0;
                        fh="/";
                        break;
                    case ".":
                        num.value=dec_number(num.value);
                        break;
                    case "←":
                        num.value=back(num.value);
                        break;
                    case "c":
                        num.value=0;
                        break;
                    case "+/-":
                        num.value=sign(num.value);
                        break;
                    case "m":
                        break;
                    case "=":
                        switch (fh) {
                            case "+":
                                num.value=tempNum+num.value*1;
                                break;
                            case "-":
                                num.value=tempNum-num.value*1;
                                break;
                            case "*":
                                num.value=tempNum*num.value*1;
                                break;
                            case "/":
                                if(num.value==0)
                                alert("除数不能为0！")
                                num.value=tempNum/num.value;
                                break;
                        }
                        break;
                }
            }
        }
    }
}
/*判断是否是数字*/
function isNumber(n) {
    return !isNaN(n);
}
/*isnull代表是字符，不能转成数字*/
function isNull(n) {
    return ((n=="0"||n.length==0));
}
/*小数点*/
function dec_number(n) {
    if(n.indexOf(".")==-1){
        n=n+".";
    }
    return n;
}
/*退位键←*/
function back(n) {
    n=n.substr(0,n.length-1);
    if(isNull(n)){
       n=0;
    }
    return n;
}
/*正负号*/
function sign(n) {
    if(n==0)
    {
        return n;
    }
    else if(n.indexOf("-")==-1){
        n="-"+n;
    }else{
        n=n.substr(1,n.length);
    }
    return n;
}
