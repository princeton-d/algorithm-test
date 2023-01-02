const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const num = input[1].split('').map(Number)
let result = 0;

for (let i = 0; i < Number(input[0]); i++) {
  result = result + num[i]
}

console.log(result)