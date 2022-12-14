

const loggedOutLinks= document.querySelectorAll (".logged-out")
const loggeInLinks= document.querySelectorAll(".logged-in")

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