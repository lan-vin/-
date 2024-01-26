import _ from 'lodash';
import './accomplish.css';
let selectedGender = "";

window.selectGender = function(sex) {
    selectedGender = sex;
    document.getElementById('getWishBtn').style.display = 'block';
}

window.getRandomWish=function(){
    if (selectedGender === "") {
        alert("Please select a gender first.");
        return;
    }

    // Send selected gender to the backend
    fetch('http://localhost:8888/wish/get', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            sex: (selectedGender === 'male') ? 1 : 0,
        }),
    })
        .then(response => response.json())
        .then(data => {
            // Display result on the web page
            document.getElementById('contact').innerText = data.data.contactinfo;
            document.getElementById('wishContent').innerText = data.data.content;
            document.getElementById('result').style.display = 'block';
        })
        .catch(error => {
            console.error('Error:', error);
        });
}