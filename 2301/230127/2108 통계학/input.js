const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n').map(Number);
const num = I.shift()
I = I.sort((a, b) => a - b)
let one = I[0]

let min = [I.filter(item => I[0] === item).length]

for (let i = 0; i < num - 1; i++) {
  one += I[i + 1]
  if (I[i] !== I[i + 1]) {
    min.push(I.filter(item => I[i + 1] === item).length)
  }
}
let k = 0
let check = 0
let index = 0
if (min.filter(item => item === Math.max(...min)).length === 1) {
  for (let i = 0; i < min.length; i++) {
    min[i] === Math.max(...min) ? check++ : ''
    if (check === 1) {
      I.length === 1 ? '' : index += 1
    } else {
      index += i
    }
  }
} else {
  while (true) {
    if (min[k] === Math.max(...min)) {
      check++
    }

    if (check === 2) {
      index += k
      break
    } else {
      index += 1
    }
    k++
  }
}

console.log(Math.round(one / num) === -0 ? 0 : Math.round(one / num))
console.log(I[Math.floor(num / 2)])
console.log(I[index])
console.log(I[num - 1] - I[0])