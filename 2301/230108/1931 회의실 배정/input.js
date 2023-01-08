const fs = require('fs')
let [ea, ...I] = fs.readFileSync(process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt').toString().trim().split('\n')
const a = I.map(num => num.split(' ').map(Number))

let result = 0

a.sort((a, b) => {
  if (a[1] !== b[1]) {
    return a[1] - b[1]
  } else {
    return a[0] - b[0]
  }
})

let t = 0
a.forEach((item) => {
  if (item[0] >= t) {
    result++
    t = item[1]
  }
})

console.log(result)