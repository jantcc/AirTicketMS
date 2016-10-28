/**
 * Created by Max on 16/10/28.
 */
var nav = document.querySelector('.nav-bar-container');
var navList = document.querySelectorAll('.nav-list');
nav.addEventListener('click', function (event) {
    var e = event || window.event;
    var target = e.target || e.srcElement;
    for (var i = 0, len = navList.length; i < len; i++) {
        navList[i].className = "nav-list";
    }

    if (target.parentNode.className == 'nav-a') {
        target.className = "nav-list list-active";
    }
 }, false);