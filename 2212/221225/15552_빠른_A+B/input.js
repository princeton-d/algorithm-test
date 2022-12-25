const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const T = Number(input.splice(0, 1))
let result = ''
for (let i = 0; i < T; i++) {
  const [x, y] = input[i].split(' ').map(Number)
  result += `${x + y}\n`
}
console.log(result.trim())