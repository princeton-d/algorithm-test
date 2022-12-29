const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const arr = input[1].split(' ').map(Number).sort((a, b) => b - a)
let result = 100;

for (let i = 1; i < Number(input[0]); i++) {
  result += arr[i] / arr[0] * 100
}
console.log(result / input[0])