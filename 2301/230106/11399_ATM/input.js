const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [N, P] = fs.readFileSync(filePath).toString().trim().split('\n')

P = P.split(' ').sort((a, b) => a - b).map(Number)
let result = 0;

for (let i = 0; i < N; i++) {
  result += P[i] * (N - i)
}
console.log(result)