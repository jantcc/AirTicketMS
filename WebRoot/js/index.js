/**
 * Created by Max on 16/11/2.
 */
var btn = document.querySelector('.loginPage');
var container = document.querySelector('.container');
var background = document.querySelector('.background');

var pageContainer = document.querySelector('.page-container');

//更新容器高度,填满浏览器
var height = document.body.clientHeight ? document.body.clientHeight : document.documentElement.clientHeight;
container.style.height = height + "px";
background.style.height = height + "px";
pageContainer.style.height = height + "px";

console.log(height);

btn.addEventListener('click', function () {
    $('.background').animate({marginTop: "-" + height + "px"}, 700);
}, false);


//更新容器高度,填满浏览器
