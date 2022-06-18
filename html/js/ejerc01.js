var user = "Pepe";
console.log(typeof user);

let a; // Global scope

function example() {
    let b; // function scope (a kind of local scope)

    {
        let d; // block scope (a kind of local scope)
    }
}
example();