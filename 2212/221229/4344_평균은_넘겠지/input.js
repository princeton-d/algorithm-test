const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

for (let i = 1; i <= Number(input[0]); i++) {
  let num = 0;
  let count = 0;
  let test = input[i].split(' ').map(Number);
  for (let j = 1; j <= test[0]; j++) {
    num += test[j];
  }
  let average = num / test[0];
  for (let k = 1; k <= test[0]; k++) {
    test[k] > average ? count++ : null;
  }
  console.log((count / (test[0]) * 100).toFixed(3) + '%');
}