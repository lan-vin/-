// loginScript.js
import _ from 'lodash';
import './log_in.css';

window.login = function() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    // 发送登录请求到后端
    fetch('http://localhost:8888/admin/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            username: username,
            password: password,
        }),
    })
        .then(response => response.json())
        .then(data => {
            alert(data.success.toString());
            if (data.success === true) {
                alert("Login successful. Redirecting to main page...");
                // Redirect to main page with username
// 要改地址//路径+参数名+参数值
                window.location.href = `../dist/index.html?username=${username}`;
            } else {
                document.getElementById("message").innerText = "Invalid username or password.";
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
}
