import {createUserWithEmailAndPassword  } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import { auth } from "./firebase2.js"
import {showMessage } from "./show_mensage.js"
const signupForm=document.querySelector("#form")


//Expresiones regulares para nombre y numero de telefono , ya que la parte de correo y contraseña ya esta validada por la autentificación
let regnomnbre=/^[a-zA-ZÀ-ÿ\s]{3,40}$/
let regntelefono=/^[0-9]{9}$/

//interrumpir proceso en javascript
var intervalo = setInterval(function() {}, 1000);


signupForm.addEventListener("submit",async (e)=>{
    e.preventDefault()
  
   const email_au = signupForm["email"].value
   const nombre_au =  signupForm["nombre"].value
   const number_au =  signupForm["phono"].value
   const pass_au =  signupForm["pass"].value

   console.log(email_au,pass_au)


//try
   try {
    const userCredential = await createUserWithEmailAndPassword(auth,email_au,pass_au)
    console.log(userCredential)

//-------------------------
//si el nombre no es valido , se interrumpe la acción de registrar en la BD y autentificacón
if(!regnomnbre.test(nombre_au)){
    alert("Nombre invalido")
    alert("Nombre invalido","error")
    alert("El nombre solo contempla letras de 3 a 40 cifras","error")
    intervalo()
 }

 if(!regntelefono.test(number_au)){
    alert("Número telefónico","error")
    alert("El número telefónico solo contempla 9 cifras ","error")
    intervalo()
}
 //-------------------------
    signupForm.reset(),

    function cerrar() {
        document.querySelector('.site').classList.remove('showmodal3')
    }

   db.collection("Usuarios").add({
    Correo: email_au,
    Nombre: nombre_au,
    Phono: number_au,
    Password: pass_au,
    
})
.then((docRef) => {
    alert(email_au)
    alert("Bienvenido "+nombre_au ,"success")
    alert("Registro exitoso" , "success")
})
.catch((error) => {
    alert("ERROR EN EL REGISTRO","error")
});

//catch
   } catch (error) {
    console.log(error.menssage)
    console.log(error.code)

    
   if(error.code ==="auth/email-already-in-use"){
    alert("El correo ya esta registrado","error")

   }else if(error.code ==="auth/invalid-email"){
    alert("El correo no es valido","error")
   }

   else if(error.code ==="auth/internal-error"){
    alert("Falta contraseña","error")

   }else if(error.code ==="auth/weak-password"){
    alert("La contraseña es muy corta","error")
    alert("La contraseña debe tener mímino 6 cifras","error")
    
   }else if(error.code){
    alert("Algo salio mal","error")
   }
   }


})

