

const loggedOutLinks= document.querySelectorAll (".logged-out1")
const loggeInLinks= document.querySelectorAll(".logged-in1")

console.log(loggedOutLinks)
console.log(loggeInLinks)


export const loginCheck = user => {
    if(user) {
        loggeInLinks.forEach(link => link.style.display ="block")
   loggedOutLinks.forEach(link => link.style.display ="none")

    }else{
        loggeInLinks.forEach(link => link.style.display ="none")
        loggedOutLinks.forEach(link => link.style.display ="block")

    }
        
}