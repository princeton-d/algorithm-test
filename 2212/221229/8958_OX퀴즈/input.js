const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const num = Number(input.splice(0, 1))
let count = 0
let result = 0;

input.map(e => {
  [...e].map(x => {
    if (x === 'O') {
      count++
      result += count
    } else {
      count = 0
    }
  })
  console.log(result)
  result = 0
  count = 0
})