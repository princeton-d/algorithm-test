const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('-')
let Y = []
console.log(I)

for (let i = 0; i < I.length; i++) {
  Y.push(I[i].split('+').map(Number).reduce((a, b) => a + b))
}
console.log(Y.reduce((a, b) => a - b))
// let I = require('fs').readFileSync('/dev/stdin').toString().trim()