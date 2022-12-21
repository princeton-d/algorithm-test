const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const input = Number(fs.readFileSync(filePath).toString().trim());

// console.log(input % 100 !== 0)
if (input % 4 === 0 && (input % 100 !== 0 || input % 400 === 0)) {
  console.log(1)
} else {
  console.log(0)
}