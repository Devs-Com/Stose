import {onAuthStateChanged} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import { auth } from "./app/firebase3.js"
import {loginCheck} from "./app/loginCheck1.js"


import "./app/singinFrom1.js"
import "./app/log_out1.js"



 
onAuthStateChanged(auth,async (user)=>{

// if(user){
 loginCheck(user)
// }else{
// loginCheck(user)
// }

})
