const fs = require('fs').readFileSync('/dev/stdin').toString().trim()
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = Number(fs.readFileSync(filePath).toString().trim())
let c = 0;
while (1) {
  if (I % 5 === 0) {
    console.log((I / 5) + c)
    break
  }
  if (I < 0) {
    console.log(-1)
    break
  }
  c++
  I -= 3
}