//封装一个代替getElementById()的方法
function byId(id){
   return typeof(id)==="string"?document.getElementById(id):id;
}
console.log(byId("main"));
var index=0,timer=null,
    pics=byId("banner").getElementsByTagName("div"),
    dots=byId("dots").getElementsByTagName("span"),
    len=pics.length;
console.log(len);
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
    //自动再main上触发鼠标离开事件
    main.onmouseout();
    //遍历所有点击，且绑定点击事件，点击圆点切换图片
    for (var d=0;d<len;d++){
        dots[d].id=d;
        dots[d].onclick=function(){
            //改变index为当前span的id值
            alert(this.id);
        }
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