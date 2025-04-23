function rollDice() {
    // Player 1 setup
    var randomNum1 = Math.floor(Math.random() * 6) + 1;
    var randomImageSource1 = "images/dice" + randomNum1 + ".png";
    var image1 = document.querySelectorAll("img")[0];
    image1.setAttribute("src", randomImageSource1);

    // Player 2 setup
    var randomNum2 = Math.floor(Math.random() * 6) + 1;
    var randomImageSource2 = "images/dice" + randomNum2 + ".png";
    var image2 = document.querySelectorAll("img")[1];
    image2.setAttribute("src", randomImageSource2);

    // Player 3 setup
    var randomNum3 = Math.floor(Math.random() * 6) + 1;
    var randomImageSource3 = "images/dice" + randomNum3 + ".png";
    var image3 = document.querySelectorAll("img")[2];
    image3.setAttribute("src", randomImageSource3);

    // Main Logic of Dice
    if (randomNum1 > randomNum2 && randomNum1 > randomNum3) {
        document.querySelector("h1").innerHTML = "🎉 Player 1 Wins!";
    } else if (randomNum2 > randomNum1 && randomNum2 > randomNum3) {
        document.querySelector("h1").innerHTML = "🎉 Player 2 Wins!";
    } else if (randomNum3 > randomNum1 && randomNum3 > randomNum2) {
        document.querySelector("h1").innerHTML = "🎉 Player 3 Wins!";
    } else {
        document.querySelector("h1").innerHTML = "It's a Draw!";
    }
}

function resetGame() {
    // Resetting dice images
    document.querySelectorAll("img")[0].setAttribute("src", "images/dice6.png");
    document.querySelectorAll("img")[1].setAttribute("src", "images/dice6.png");
    document.querySelectorAll("img")[2].setAttribute("src", "images/dice6.png");

    // Resetting heading
    document.querySelector("h1").innerHTML = "Let's Play Dice!";
}
