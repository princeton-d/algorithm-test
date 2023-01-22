const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = parseInt(fs.readFileSync(filePath).toString().trim())

let f = 0
let o = 0
let t = 0

while (I > 0) {
  if (I >= 300) {
    f = Math.floor(I / 300)
    I = I % 300
  } else if (I < 600 && I >= 60) {
    o = Math.floor(I / 60)
    I = I % 60
  } else if (I < 60 && I >= 10) {
    t = Math.floor(I / 10)
    I = I % 10
  } else {
    break
  }
}

I !== 0 ? console.log(-1) : console.log(`${f} ${o} ${t}`)