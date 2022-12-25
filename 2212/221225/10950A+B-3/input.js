const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const testCase = Number(input.splice(0, 1))

for (let i = 0; i < testCase; i++) {
  const [x, y] = input[i].split(' ').map(Number)
  console.log(x + y)
}