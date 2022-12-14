import {GoogleAuthProvider , signInWithPopup  } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
import {auth} from "./firebase2.js"
import {showMessage} from "./show_mensage.js"
const googleButton = document.querySelector("#btnGoogle")
const googleButton2 = document.querySelector("#btnGoogle2")

googleButton.addEventListener("click" , async () =>{

const provider = new GoogleAuthProvider()



try {
    const credentials =  await signInWithPopup(auth , provider)
    console.log(credentials)
    alert("Welcome " + credentials.user.displayName);
} catch (error) {
    console.log(error)
}

})

googleButton2.addEventListener("click" , async () =>{

    const provider = new GoogleAuthProvider()
    
    
    
    try {
        const credentials =  await signInWithPopup(auth , provider)
        console.log(credentials)
        alert("Welcome " + credentials.user.displayName);
    } catch (error) {
        console.log(error)
    }
    
    
    
    
    
    
    
    })