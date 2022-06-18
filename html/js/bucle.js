let metros = 0;
for (let vueltas = 0; vueltas < 5; vueltas++) {

    metros += 400;
    console.log(vueltas + ") Has recorrido " + metros + " metros");

    if (metros == 2000) {
        console.log("Great!");
    }

}