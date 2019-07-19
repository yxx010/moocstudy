//封装一个代替getElementById()的方法
function byId(id){
   return typeof(id)==="string"?document.getElementById(id):id;
}
console.log(byId("main"));
var index=0,timer=null,
    pics=byId("banner").getElementsByTagName("div"),
    dots=byId("dots").getElementsByTagName("span"),
    prev=byId("prev"),
    next=byId("next"),
    len=pics.length;
function slideImg() {
    var main=byId("main");
    main.onmouseover=function(){
        //鼠标悬停时，不轮播
        if(timer)
            clearInterval(timer);
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
    //自动在main上触发鼠标离开事件，这样才能开始3秒切换图片
    main.onmouseout();
    //遍历所有点击，且绑定点击事件，点击圆点切换图片
    for (var d=0;d<len;d++){
        dots[d].id=d;
        dots[d].onclick=function(){
            //改变index为当前span的id值
            index=this.id;
            changeImg();
        }
    }
    //给上一张下一张绑定时间，切换图片
    next.onclick=function(){
        index++;
        if(index>=len) index=0;
        changeImg();
    }
    prev.onclick=function(){
        index--;
        if(index<0) index=len-1;
        changeImg();
    }
}
function changeImg(){
    //遍历所有div，将其属性变成隐藏
    for(var i=0;i<len;i++){
        pics[i].style.display="none";
        dots[i].className="";
    }
    //让选中图片展示
    pics[index].style.display='block';
    //让选中图片对应的小圆点展示
    dots[index].className="active";

}
slideImg();