function ymd(){
    var yyyy=document.getElementById("yyyy");
    var mm=document.getElementById("mm");
    var dd=document.getElementById("dd");
    var date=new Date();
    var year=parseInt(date.getFullYear());
    initSelect(yyyy,1999,year);
    initSelect(mm,1,12);
    initSelect(dd,1,31);
    var n=yyyy.length;
    yyyy.selectedIndex=Math.round(n/2);

}
function initSelect(obj,start,end) {
    for(var i=start;i<=end;i++){
        obj.options.add(new Option(i,i));

    }
}

function selectYmd() {
    var yyyy = document.getElementById("yyyy");
    var mm = document.getElementById("mm");
    var dd = document.getElementById("dd");
    var m = parseInt(mm.value);
    var dayEnd;
    if (m == 4 || m == 6 || m == 9 || m == 11) {
        dayEnd = 30;
    } else if (m == 2) {
        dayEnd = 28;
        y = yyyy.value;
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            dayEnd = 29;
    } else {
        dayEnd = 31;
    }
    //方法一，全部清空，重新加入，建议使用
    dd.options.length=0;
    initSelect(dd,1,dayEnd);
    /*方法二，根据实际情况增加、删除天数*/
    //updateDay(dayEnd);
}
function updateDay (days){
    var dd=document.getElementById("dd");
    var len=dd.options.length;
    if(len>days){
        //数组长度>当月天数，删除天数
        for (var i=len;i>days;i--){
            dd.options.remove(i-1);
        }
        return;
    }
    else{
        //数组长度<当月天数，增加天数；数组长度=当月天数，不进循环
        for (var i=len;i<days;i++)
        {
            dd.options.add(new Option(i+1, i+1));
        }
        return;
    }
}