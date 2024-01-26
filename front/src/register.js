import _ from 'lodash';
import './register.css';
window.registerUser = function() {
    const gender = document.getElementById("sex").value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;


    if (!username || !password) {
        document.getElementById("message").innerText = "Please enter both username and password.";
        return;
    }

    // Send registration request to the backend
    fetch('http://localhost:8888/admin/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            sex: (gender === 'male') ? 1 : 0,
            username: username,
            password: password
        }),
    })
        .then(response => response.json())
        .then((data) => {
            if (data.error === true) {
                alert(data.message); // Username already exists
            } else {
                alert('Registration successful');
                // Redirect to login page (replace this with your actual login page URL)
                window.location.href = '../dist/log_in.html';
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
}