const word = "Mississippi";
let countS = 0;
let countI = 0;

for (let i = 0; i <word.length ; i++) {
    if (word[i] === 's'){
        countS ++;

    }else if (word[i]=== 'i'){
        countI++;
    }

}
console.log("The occurrence number of S is:" + countS);
console.log("The occurrence number of I is:" + countI);