const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = +fs.readFileSync(filePath).toString().trim()
const x = Math.floor(I / 5)
const y = I % 5

switch (y) {
  case 1:
    x === 0 ? console.log(-1) : console.log(x + 2)
    break;
  case 2:
    console.log(x + 1)
    break;
  case 3:
    x === 0 ? console.log(-1) : console.log(x + 3)
    break;
  case 4:
    console.log(x + 2)
    break;
  default:
    console.log(x)
}