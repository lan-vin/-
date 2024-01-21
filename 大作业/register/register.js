function registerUser() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Send registration request to the backend
    fetch('http://localhost:8888/admin/register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username: username, password: password }),
    })
        .then(response => response.json())
        .then(data => {
            if (data.error) {
                alert(data.message); // Username already exists
            } else {
                alert('Registration successful');
                // Redirect to login page (replace this with your actual login page URL)
                window.location.href = 'login.html';
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
}