const navSlide = () => {
    // Fetching class selectors and storing in variable to create animations
    const burger = document.querySelector('.burger');
    const nav = document.querySelector('.nav-links');
    const navLinks = document.querySelectorAll('.nav-links li');

    // Toggle Nav bar
    burger.addEventListener('click', () => {
        nav.classList.toggle('nav-active');

        // Animate Links
        navLinks.forEach((link,index) => {
            if(link.style.animation) {
                link.style.animation = '';
            } else {
                link.style.animation = `navLinkFade 0.5s ease forwards ${index / 7 + 0.3}s`
            }
        });

        //Burger animation
        burger.classList.toggle('toggle');
    });
}

// Runs function with all animations for nav bar links and burger inside it each time the burger is toggled.
navSlide();

