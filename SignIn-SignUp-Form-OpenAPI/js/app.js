// Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyDVUad19yK1d2OZqVJ8LlXBiisr-SRNAts",
    authDomain: "jwt-openapi.firebaseapp.com",
    projectId: "jwt-openapi",
    storageBucket: "jwt-openapi.appspot.com",
    messagingSenderId: "139216114133",
    appId: "1:139216114133:web:6ae2de99c112325318ed5c"
};

// Firebase initialize
firebase.initializeApp(firebaseConfig);

// Auth module enabled
const auth = firebase.auth();

// Sign-Up using auth Module
if (document.getElementById('regBtn')) {
    document.getElementById('regBtn').addEventListener('click', () => {
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;

        // Use auth.createUserWithEmailAndPassword, not auth().createUserWithEmailAndPassword
        auth.createUserWithEmailAndPassword(email, password)
            .then((userCredential) => {
                // Sign-up successful
                alert('Registration successful!');
                const user = userCredential.user;
                console.log(user);
                // Optional: Redirect to another page
                // window.location.href = 'welcome.html';
            })
            .catch((error) => {
                const errorCode = error.code;
                const errorMessage = error.message;
                console.error(`Error: ${errorCode}, ${errorMessage}`);
                alert(`Error: ${errorMessage}`);
            });
    });
}
