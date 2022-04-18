function goToUrl( url) {
    window.location.href =url;
}

let toggleButton = document.querySelector(".container");

toggleButton.onclick = function() {
    toggleButton.classList.toggle("active")
}

