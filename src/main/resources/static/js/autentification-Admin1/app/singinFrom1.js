import {signInWithEmailAndPassword  } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import { auth } from "./firebase3.js";
// import { showMessage } from "./show_mensage.js";

const signInForm = document.querySelector("#form3");

signInForm.addEventListener("submit" , async e =>{

e.preventDefault()
const email3 = signInForm["email3"].value
const password3 = signInForm["pass3"].value

try {
    const credentials= await signInWithEmailAndPassword(auth,email3,password3)
    alert("Bienvenido "+email3 ,"success")
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
