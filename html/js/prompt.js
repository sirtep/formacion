let lang = prompt('Introduce tu nombre: ');

let feedback = lang.toLowerCase() === 'javascript' ? `It's great!` :
    `Hola ${lang}`;

alert(feedback);