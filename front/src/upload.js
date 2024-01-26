import _ from 'lodash';
import './upload.css';


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
    document.getElementById('username').innerText=`${username}`;

    window.toindex = function() {
        const content = document.getElementById("content").value;

        fetch('http://localhost:8888/result/addresult', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({
                    content: content,
                }),
            }
        )
        window.location.href = `./index.html?username=${username}`;
    }
