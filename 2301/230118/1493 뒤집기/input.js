const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim()
let count = 0

for (let i = 0; i <= I.length; i++) {
  if (I[i] !== I[i + 1]) {
    count++
  }
}
count % 2 === 0 ? console.log(count / 2) : console.log((count - 1) / 2)