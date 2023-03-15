const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let input = fs.readFileSync(filePath).toString().trim().split("\n").map(Number);
const M = input[0];
const N = input[1];
const primeNumber = [];
let result = 0;

for (let i = M; i <= N; i++) {
  if (i === 1 || i % 2 === 0) {
    continue;
  }

  for (let j = 2; j <= i; j++) {
    if (i % j === 0) {
      break;
    }

    if (j * 2 > i) {
      primeNumber.push(i);
      result += i
      break;
    }
  }

  // let num = 2;
  // while (i >= num) {
  //   if (num * 2 > i) {
  //     primeNumber.push(i);
  //     result += i;
  //     break;
  //   }

  //   if (i % num === 0) {
  //     break;
  //   }

  //   num++;
  // }
}

if (primeNumber.length === 0) {
  console.log(-1);
} else {
  console.log(result);
  console.log(primeNumber[0])
}