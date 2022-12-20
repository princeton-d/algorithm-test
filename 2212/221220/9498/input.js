const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const input = Number(fs.readFileSync(filePath).toString().trim());

if (input > 79) {
  input > 89 ? console.log('A') : console.log('B');
} else if (input > 59) {
  input > 69 ? console.log('C') : console.log('D');
} else {
  console.log('F')
}