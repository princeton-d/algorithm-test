const fs = require('fs')
const { resourceLimits } = require('worker_threads')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [num, ...I] = fs.readFileSync(filePath).toString().trim().split('\n').map(Number)
let result = []
let R = 0

function calc() {
  I.sort((a, b) => a - b)
  for (let i = 0; i < num; i += 2) {
    if (I[i + 1] !== undefined) {
      result.push(I[i] + I[i + 1])
      R += I[i] + I[i + 1]
    } else {
      result.push(I[i])
    }
  }
  I = [...result]
  console.log(I)
  result.length = 0
  num = Math.ceil(num / 2)
  if (num === 1) {
    return console.log(R)
  } else {
    calc(num)
  }
}
calc(num)

// let I = require('fs').readFileSync('/dev/stdin').toString().trim()