function logBool(x) {
    x = typeof x !== 'undefined' && x ? true : false;
    console.log(x);
}

var a, b = false,
    c = true;
logBool(a); // false
logBool(b); // false
logBool(c); // true