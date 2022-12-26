const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim())
let star = ''

for (let i = input; i > 0; i--) {
  star = '';
  for (let j = 1; j <= input; j++) {
    j >= i ? star += '*' : star += ' '
  }
  console.log(star)
}