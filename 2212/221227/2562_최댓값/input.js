const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n').map(Number)
let x = input[0]
let count = 1

for (let i = 1; i < input.length; i++) {
  if (input[i] > x) {
    x = input[i]
    count = i + 1
  }
}
console.log(`${x}
${count}`)