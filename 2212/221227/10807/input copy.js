const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [x, y, z] = fs.readFileSync(filePath).toString().trim().split('\n')
y = y.split(' ').map(Number)
let count = 0;

for (let i = 0; i < Number(x); i++) {
  y[i] == z ? count++ : ''
}
console.log(count)