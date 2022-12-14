
import {signOut} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import{ auth } from "./firebase3.js"




const logout = document.querySelector("#loguot-admin1");

logout.addEventListener("click", async () => {
await signOut(auth)

console.log("cerrar sesion")
});