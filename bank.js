// Ensure this script runs after the page content is fully loaded
document.addEventListener("DOMContentLoaded", function() {
    // Add event listener to login form if it exists on the page
    var loginForm = document.getElementById("loginForm");
    if (loginForm) {
        loginForm.addEventListener("submit", function(event) {
            event.preventDefault();
            
            // Get the input values
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            // Simple validation
            if (username === "admin" && password === "admin123") {
                // Redirect to the home page
                window.location.href = "home.html";
            } else {
                alert("Invalid username or password. Please try again.");
            }
        });
    }

    // Add event listener to logout button if it exists on the page
    var logoutButton = document.getElementById("logout");
    if (logoutButton) {
        logoutButton.addEventListener("click", function(event) {
            event.preventDefault();
            // Redirect to the login page
            window.location.href = "login.html";
        });
    }
    document.addEventListener("DOMContentLoaded", function() {
        document.getElementById("logout").addEventListener("click", function(event) {
            event.preventDefault();
            // Redirect to the login page
            window.location.href = "login.html";
        });
    });
    
});

