//封装一个代替getElementById()的方法
function byId(id){
   return typeof(id)==="string"?document.getElementById(id):id;
}
console.log(byId("main"));
var index=0,timer=null,pics=byId("banner").getElementsByTagName("div"),
len=pics.length;
console.log(len);
function slideImg() {
    var  main=byId("main");
    main.onmouseover=function(){

    }
    main.onmouseout=function(){
        timer=setInterval(function(){
            index++;
            if(index>=len){
                index=0;
            }
            //console.log(index);
            changeImg();
        },3000);
    }
}
function changeImg(){
    //便利所有div，将其隐藏
    for(var i=0;i<len;i++){
        pics[i].style.display="none";
    }
    pics[index].style.display='block';
}
slideImg();