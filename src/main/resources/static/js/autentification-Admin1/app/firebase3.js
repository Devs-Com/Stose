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
      apiKey: "AIzaSyDqWbRxb2rMRcOGafgnWpAQVkx7HEtPjgY",
      authDomain: "authentication-admin-stose.firebaseapp.com",
      projectId: "authentication-admin-stose",
      storageBucket: "authentication-admin-stose.appspot.com",
      messagingSenderId: "740637801443",
      appId: "1:740637801443:web:37dddbb012de9f22c3fed6"
      //CUENTA DE CERTUS
      // apiKey: "AIzaSyAXkcOqBs65qpvfJs4lcmxVs3KPY2VjDZA",
      // authDomain: "registro-administrador-stose.firebaseapp.com",
      // projectId: "registro-administrador-stose",
      // storageBucket: "registro-administrador-stose.appspot.com",
      // messagingSenderId: "435802184488",
      // appId: "1:435802184488:web:d89f2498f7bb26b241ce1d"
    };
  
    // Initialize Firebase
    export const app = initializeApp(firebaseConfig);
    export const auth=getAuth(app)

  