const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'


let I = +fs.readFileSync(filePath).toString().trim();
let count = 0;

while (true) {
  if (I % 5 === 0) {
    console.log(I / 5 + count);
    break;
  }

  if (I < 0) {
    console.log(-1);
    break;
  }

  I -= 3;
  count++;
}