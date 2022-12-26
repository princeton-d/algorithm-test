const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')

for (let i = 0; i < input.length; i++) {
  const [A, B] = input[i].split(' ').map(Number)
  console.log(A + B)
}