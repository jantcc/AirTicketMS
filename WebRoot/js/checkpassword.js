function check(){
var password1 = document.getElementById("newpassword").value;
var password2 = document.getElementById("confirmpassword").value;
  if(password1 == password2) {
	  document.getElementById("tishi").innerHTML="<font color='green'>两次密码相同</font>";
  }else{
	  document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
  }
 
}