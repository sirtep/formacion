const parrafos = document.querySelectorAll('.parrafo');
if (parrafos.length == 0) {
    parrafos[0].style.color = 'red';
} else if (parrafos.length != 0 && parrafos.lenght >= 1) {
    parrafos[0].style.color = 'red';
    parrafos[parrafos.lenght - 1].style.color = 'blue';
}

document.getElementById("java").checked = true;