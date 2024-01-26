import _ from 'lodash';
import './makewish.css'

function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, '\\$&');
    var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, ' '));
}

// 从URL中获取用户名
const username = getParameterByName('username');
document.getElementById('username').innerText = `${username}`;

window.toindex = function() {
    const content = document.getElementById("content").value;
    const sex = document.getElementById("sex").value;
    const contactinfo = document.getElementById("contactinfo").value;

    fetch('http://localhost:8888/wish/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            content: content,
            sex: (sex === 'male') ? 1 : 0,
            contactinfo: contactinfo
        }),
    })
    window.location.href = `./index.html?username=${username}`
}

