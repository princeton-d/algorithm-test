const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const [x, y] = fs.readFileSync(filePath).toString().split('\n').map(Number)

if (x > 0) {
  y > 0 ? console.log(1) : console.log(4)
} else {
  y > 0 ? console.log(2) : console.log(3)
}