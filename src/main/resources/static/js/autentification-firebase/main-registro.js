import {onAuthStateChanged} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import { auth } from "./app/firebase2.js"
import {loginCheck} from "./app/loginCheck.js"

import "./app/signunpForm.js"
import "./app/singinFrom.js"
import "./app/log_out.js"
import "./app/googleLogin.js"
import "./app/facebookLogin.js"

 
onAuthStateChanged(auth,async (user)=>{

// if(user){
 loginCheck(user)
// }else{
// loginCheck(user)
// }

})
