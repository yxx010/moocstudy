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
    len=pics.length,
    menu=byId("menu-content"),
    subMenu=byId("sub-menu"),
    innerBox=subMenu.getElementsByClassName("inner-box"),
    menuItems=menu.getElementsByClassName("menu-item");
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
//导航菜单，绑定事件
    for (var m=0;m<menuItems.length;m++){
        menuItems[m].setAttribute("data-index",m);
        menuItems[m].onmouseover=function(){
           //每一个menu-item定义data-index
            var idx=this.getAttribute("data-index");
            //去掉sub-menu上的hide属性
            subMenu.className="sub-menu";
            //循环，在鼠标移动到上面时让所有的变成none，然后只展示选中的
            for(var j=0;j<innerBox.length;j++){
              innerBox[j].style.display='none';
              menuItems[j].style.background="none";
            }
            menuItems[idx].style.background='rgba(0,0,0,0.1)';
            innerBox[idx].style.display='block';
        }
        menu.onmouseout=function () {
            subMenu.className="sub-menu hide";

        }
        subMenu.onmouseover=function(){
            this.className="sub-menu";
        }
        subMenu.onmouseout=function(){
            this.className="sub-menu hide";
        }
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