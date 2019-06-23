function show(){
    document.getElementById("userName").value="999";
    alert(document.getElementById("userName").value);
    var xb=document.getElementsByName("xb");
    var xbTest;
    if(xb[0].checked){
        xbTest=xb[0].value;
    }
    else{
        xbTest=xbTest[0].value;
    }
    alert(xbTest);
}