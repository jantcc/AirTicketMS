/**
 * Created by Max on 16/10/31.
 */
var renderForm = document.querySelector('.render-form');
var editForm = document.querySelector('.edit-form');
var renderFlag = document.querySelector('.render-form-flag');
var editFlag = document.querySelector('.edit-form-flag');
var renderValues = document.querySelectorAll('.render-value');
var editValues = document.querySelectorAll('edit-value');


renderFlag.addEventListener('click', function () {
    renderForm.style.display = "none";
    editForm.style.display = "block";

}, false);

editFlag.addEventListener('click', function () {
    editForm.style.display = "none";
    renderForm.style.display = "block";

}, false);
