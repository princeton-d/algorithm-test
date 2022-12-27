const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let input = Number(fs.readFileSync(filePath).toString().trim())

let ten = input < 10 ? 0 : Math.floor(input / 10)
let one = input % 10
let count = 0
let result = ''

while (input !== result) {
  result = (one * 10) + ((ten + one) % 10)
  ten = Math.floor(result / 10)
  one = result % 10
  count++
}
console.log(count)