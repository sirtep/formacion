function cambiar(flag, img) {
    if (document.images) {
        if (document.images[img].permitirloaded) {
            if (flag == 1) document.images[img].src = document.images[img].permitir.src
            else document.images[img].src = document.images[img].permitir.oldsrc
        }
    }
}

function preloadcambiar(img, adresse) {
    if (document.images) {
        img.onload = null;
        img.permitir = new Image();
        img.permitir.oldsrc = img.src;
        img.permitir.src = adresse;
        img.permitirloaded = true;
    }
}