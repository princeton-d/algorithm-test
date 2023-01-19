const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [N, H] = fs.readFileSync(filePath).toString().trim().split('\n')

N = N % 2 === 0 ? N / 2 - 1 : N / 2 - 0.5
H = H.split(' ').map(Number).sort((a, b) => a - b)

console.log(H[N])