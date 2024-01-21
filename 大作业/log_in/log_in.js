// loginScript.js

function login() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // 发送登录请求到后端
    fetch('http://localhost:8888/admin/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username: username, password: password }),
    })
        .then(response => {
            if (response.ok) {
                // 登录成功，可以进行相应的操作
                console.log('Login successful');
            } else {
                // 登录失败，显示错误信息
                console.error('Login failed');
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
}