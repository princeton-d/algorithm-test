const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n').map(Number)
let N = I.splice(0, 1)
I.sort((a, b) => b - a)
let G = I[0]
let NG = 0

for (let i = 1; i <= N; i++) {
  NG = I[i] * (i + 1)
  if (G <= NG) {
    G = NG
  }
}
console.log(G)