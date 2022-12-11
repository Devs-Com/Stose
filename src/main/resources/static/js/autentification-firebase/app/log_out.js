
import {signOut} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import{ auth } from "./firebase2.js"




const logout = document.querySelector("#loguot");

logout.addEventListener("click", async () => {
await signOut(auth)

console.log("cerrar sesion")
});