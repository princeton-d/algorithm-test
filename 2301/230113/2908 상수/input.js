const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [x, y] = fs.readFileSync(filePath).toString().trim().split(' ').map((item) => item.split('').reverse())
let i = 0

while (true) {
  if (x[i] > y[i]) {
    console.log(x.join(''))
    break
  } else if (x[i] < y[i]) {
    console.log(y.join(''))
    break
  }
  i++
}