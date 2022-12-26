const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim())

for (let i = 1; i <= input; i++) {
  console.log(' '.repeat(input - i) + '*'.repeat(i))
}