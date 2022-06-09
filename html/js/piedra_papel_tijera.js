//Object
game = {
    options: {
        0: "✂️",
        1: "🖐",
        2: "🤜"
    },
    playersName: {
        player1: "player1",
        player2: "Computer"
    },
    scores: {
        pointsP1: 0,
        pointsP2: 0
    }
};

//Functions
let askNewName = () => {
    return window.prompt("Introduce el nuevo nombre de player1:");
}

let changeName = (newName) => {
    if (/^[a-zA-Z]+/.test(newName)) {
        game.playersName.player1 = newName;
        document.write("Bienvenid@ ", game.playersName.player1, "🙋‍♂!<br>");
    } else {
        document.write("Mmmm va a ser que no. Mejor te llamaré... " + game.playersName.player1 + "<br>");
    }
}

let numberRandom = () => {
    let aleatorio = Math.floor(Math.random() * 2);
    return aleatorio.toString();
}

let printHandRandom = () => {
    return game.options[numberRandom()];
}

let printResult = (scorePlayer1, scorePlayer2) => {
    if (scorePlayer1 < scorePlayer2) {
        document.write("Fin del juego gana Game Over " + game.playersName.player2 + "👾🙌<br>"); //win computer
    } else {
        document.write("Fin del juego gana " + game.playersName.player1 + "🙋‍♂🙌<br>"); //win player1
    }
}

let result = (win) => {
    if (win == 0) {
        document.write("🥊 " + game.playersName.player1 + " :[" + game.scores.pointsP1 + "]" + game.playersName.player2 + " :[" + game.scores.pointsP2 + "] 🥊<br>");
    } else if (win == 1) {
        document.write("🥊" + game.playersName.player1 + " :[" + game.scores.pointsP1 + "]" + game.playersName.player2 + " :[" + game.scores.pointsP2 + "]<br>");
    } else {
        document.write(game.playersName.player1 + " :[" + game.scores.pointsP1 + "]" + game.playersName.player2 + " :[" + game.scores.pointsP2 + "] 🥊<br>");
    }
}

let evaluate = (player1Hand, player2Hand) => {
    let win = 0;
    if (player1Hand === player2Hand) {
        document.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + player1Hand + " VS " + player2Hand + " empatan<br>");
    } else if (player1Hand === game.options["0"] && player2Hand === game.options["1"] ||
        player1Hand === game.options["1"] && player2Hand === game.options["2"] ||
        player1Hand === game.options["2"] && player2Hand === game.options["0"]) {
        document.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + player1Hand + " gana a " + player2Hand + "<br>");
        game.scores.pointsP1++;
        win = 1;
    } else {
        document.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + player2Hand + " gana a " + player1Hand + "<br>");
        game.scores.pointsP2++;
        win = 2;
    }
    result(win);
}

let main = () => {
    while ((game.scores.pointsP1 || game.scores.pointsP2) != 3) { //number of winings
        let player1Hand = printHandRandom();
        let player2Hand = printHandRandom();

        document.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🃏" + game.playersName.player1 + " " + player1Hand + "<br>");
        document.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;🃏" + game.playersName.player2 + " " + player2Hand + "<br>");
        evaluate(player1Hand, player2Hand);
    }
    printResult(game.scores.pointsP1, game.scores.pointsP2);
}

//Start program
changeName(askNewName());
document.write("🏁 Que comience el juego 🏁<br>");
main();