    // Import the functions you need from the SDKs you need
    import { initializeApp } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-app.js";
  
    // TODO: Add SDKs for Firebase products that you want to use
    // https://firebase.google.com/docs/web/setup#available-libraries
    import {getAuth } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js"
    // Your web app's Firebase configuration
    const firebaseConfig = {

      //JHON.FRANCO.AGUILAR.DEV@GMAIL
      // apiKey: "AIzaSyDVd3ULWEmZthmNTZ1KIfjFBzJFRqk6bNo",
      // authDomain: "auten-user-registro-stose.firebaseapp.com",
      // projectId: "auten-user-registro-stose",
      // storageBucket: "auten-user-registro-stose.appspot.com",
      // messagingSenderId: "319298742086",
      // appId: "1:319298742086:web:1ff1c55ec06342937e2747"

      //CUENTA STOSE
      apiKey: "AIzaSyC4hlEjzJysblcgFkjt9tdwawJuwJcUPUk",
      authDomain: "authentication-users-stose.firebaseapp.com",
      projectId: "authentication-users-stose",
      storageBucket: "authentication-users-stose.appspot.com",
      messagingSenderId: "95941124661",
      appId: "1:95941124661:web:2993754577c6d40dbd477c"
      //CUENTA DE CERTUS
      // apiKey: "AIzaSyDpP_veHq_ZD5qGpLOzCUbTwxM19gvBWOs",
      // authDomain: "autentication-stose.firebaseapp.com",
      // projectId: "autentication-stose",
      // storageBucket: "autentication-stose.appspot.com",
      // messagingSenderId: "71501089440",
      // appId: "1:71501089440:web:e9fe412cf702c16716d7c5"
    };
  
    // Initialize Firebase
    export const app = initializeApp(firebaseConfig);
    export const auth=getAuth(app)

  