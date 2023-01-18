const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [a, b] = fs.readFileSync(filePath).toString().trim().split(' ').map(Number)
let count = 1

while ((a !== b) && (a < b)) {
  if (b % 10 === 1) {
    b = (b - 1) / 10
  } else if (b % 2 === 0) {
    b = b / 2
  } else if (b % 2 !== 0) {
    count = -1
    break
  }
  count++
}

a === b ? console.log(count) : console.log(-1)