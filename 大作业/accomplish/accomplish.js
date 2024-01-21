let selectedGender = "";

function selectGender(gender) {
    selectedGender = gender;
    document.getElementById('getWishBtn').style.display = 'block';
}

function getRandomWish() {
    if (selectedGender === "") {
        alert("Please select a gender first.");
        return;
    }

    // Send selected gender to the backend
    fetch('http://localhost:8888/admin/getWish', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ gender: selectedGender }),
    })
        .then(response => response.json())
        .then(data => {
            // Display result on the web page
            document.getElementById('contact').innerText = data.contactInfo;
            document.getElementById('wishContent').innerText = data.content;
            document.getElementById('result').style.display = 'block';
        })
        .catch(error => {
            console.error('Error:', error);
        });
}