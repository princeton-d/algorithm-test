const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = parseInt(fs.readFileSync(filePath).toString().trim())

let f = 0
let o = 0
let t = 0

while (I > 0) {
  if (I >= 300) {
    I -= 300
    f++
  } else if (I < 600 && I >= 60) {
    I -= 60
    o++
  } else if (I < 60 && I >= 10) {
    I -= 10
    t++
  } else {
    break
  }
}

I !== 0 ? console.log(-1) : console.log(`${f} ${o} ${t}`)