const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('').sort()

const arrLeft = []
const arrRight = []
const arrOddNum = []
let result = true

for (let i = 0; i < I.length; i += 2) {
  if (I[i] === I[i + 1]) {
    arrLeft.push(I[i])
    arrRight.unshift(I[i + 1])
  } else if (arrOddNum.length === 0 && I.length === 1) {
    arrLeft.push(I[i])
    arrRight.unshift(I[i + 1])
  } else if (arrOddNum.length === 0) {
    arrOddNum.push(I[i])
    i--
  } else {
    result = false
  }
}

result ? console.log(arrLeft.concat(arrOddNum, arrRight).join('')) : console.log("I'm Sorry Hansoo")