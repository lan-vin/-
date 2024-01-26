import _ from 'lodash';
import './index.css';
import mainImage from './R.png';


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
    document.getElementById('add').innerText = `${username}`;


    window.tomakewish = function() {
    window.location.href = `./makewish.html?username=${username}`;
}

    window.toupload = function() {
    window.location.href = `./upload.html?username=${username}`;
}

    window.toaccomplish = function() {
    window.location.href = `./accomplish.html?username=${username}`;
}

