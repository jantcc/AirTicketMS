/**
 * Created by Max on 16/11/2.
 */
var btn = document.querySelector('.loginPage');
var container = document.querySelector('.container');
var background = document.querySelector('.background');
btn.addEventListener('click', function () {
    $('.background').animate({marginTop: "-738px"}, 700);
}, false);