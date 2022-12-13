import {signInWithEmailAndPassword  } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import { auth } from "./firebase2.js";
// import { showMessage } from "./show_mensage.js";

const signInForm = document.querySelector("#form2");

signInForm.addEventListener("submit" , async e =>{

e.preventDefault()
const email2 = signInForm["email2"].value
const password2 = signInForm["pas2"].value



try {
    const credentials= await signInWithEmailAndPassword(auth,email2,password2)
    alert("Bienvenido "+email2 ,"success")
    console.log(credentials)
} catch (error) {
    if(error.code === "auth/wrong-password")
    alert("La contraseña es invalida","error")
 else if(error.code === "auth/user-not-found"){
    alert("Correo no fue encontrado","error")
} else{
    alert("Algo salió mal","error")
}
}
})
