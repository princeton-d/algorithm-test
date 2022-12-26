const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim())
let star = ''

for (let i = 1; i <= input; i++) {
  star = ''
  for (let j = 0; j < i; j++) {
    star += '*'
  }
  console.log(star)
}