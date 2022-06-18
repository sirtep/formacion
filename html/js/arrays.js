const array = ["🍔", "🌯", "🍣", "🍕", "🍜", "🍱", "🍙", "🍘", "🥩"];

array.filter(item => {
    if (item == '🍕') {
        console.log('🍺');
    };
});

const array2 = ["🍕", "🍕", "🍍", "🍕", "🍕"];

function pineapple(element, index, array2) {
    if (element == "🍍") {
        console.log(array2[index] + " encontrada" + index);
    }
}

const array5 = ["🌶", "🥛", "🌶", "🥛", "🌶", "🥛"];
array5.map((item, index, arr) => {
    if (item === "🌶") {
        //console.log(arr[index + 1]);
        console.log("La 🌶 está aquí: " + (index));
        console.log("La 🥛 está aquí: " + (index + 1));
        // array.splice(arr[index], arr[index + 1], "😀");
        // console.log(arr);
        //slice
    }
});