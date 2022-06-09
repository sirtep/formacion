const parrafos = document.querySelectorAll('.parrafo');
if (parrafos.length == 0) {
    parrafos[0].style.color = 'red';
} else if (parrafos.length != 0 && parrafos.lenght >= 1) {
    parrafos[0].style.color = 'red';
    parrafos[parrafos.lenght - 1].style.color = 'blue';
}

function sampleClick() {
    varbtnX = document.getElementById("btn");
    btnX.disabled = true;
}