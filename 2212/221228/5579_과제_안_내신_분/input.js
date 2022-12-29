const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n').map(Number).sort((a, b) => a - b)

for (let i = 1; i < 31; i++) {
  if (input[0] === i) {
    input.shift()
  } else {
    console.log(i)
  }
}