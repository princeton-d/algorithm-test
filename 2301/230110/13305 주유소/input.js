const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n')
let x = I[0] - 1;
let y = I[1].split(' ').map(y => BigInt(y))
let z = I[2].split(' ').map(z => BigInt(z))
let p = z[0]
let result = 0n

for (let i = 0; i < x; i++) {
  result += p * y[i]
  if (p > z[i + 1]) {
    p = z[i + 1]
  }
}

console.log(String(result))