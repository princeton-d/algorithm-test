const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim())
let result = 0;
for (let i = 1; i <= input; i++) {
  result += i
}
console.log(result)