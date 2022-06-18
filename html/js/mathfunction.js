function math() {
    console.log(Math.round(Math.random()));
    return math;
}
math();
if (math == 0) {
    console.log("Es cara");
} else console.log("Es cruz");