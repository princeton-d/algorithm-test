const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const T = Number(input.splice(0, 1))

for (let i = 0; i < T; i++) {
  const [x, y] = input[i].split(' ').map(Number)
  console.log(`Case #${i + 1}: ${x + y}`)
}