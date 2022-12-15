import {FacebookAuthProvider , signInWithPopup  } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import {auth} from "./firebase2.js"
import {showMessage} from "./show_mensage.js"
const FacebookButton = document.querySelector("#btnFacebook")
const FacebookButton2 = document.querySelector("#btnFacebook2")

FacebookButton.addEventListener("click" , async () =>{

const provider = new FacebookAuthProvider()



try {
    const credentials =  await signInWithPopup(auth , provider)
    console.log(credentials)
    alert("Welcome " + credentials.user.displayName);
} catch (error) {
    console.log(error)
}

})

FacebookButton2.addEventListener("click" , async () =>{

    const provider = new FacebookAuthProvider()
    
    
    try {
        const credentials =  await signInWithPopup(auth , provider)
        console.log(credentials)
        alert("Welcome " + credentials.user.displayName);
    } catch (error) {
        console.log(error)
    }
    
    
    })