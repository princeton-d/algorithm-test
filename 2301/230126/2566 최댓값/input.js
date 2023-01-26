const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split(`\n`);
let count = 0;
let result = 0;

let maxNum = I.join(' ').split(' ').map(Number).sort((a, b) => b - a)[0];

while (count < 9) {
  if (I[count].indexOf(maxNum) > -1) {
    result = I[count].split(' ').map(Number).indexOf(maxNum) + 1
    break
  }
  count++
}

console.log(`${maxNum}
${count + 1} ${result}`)