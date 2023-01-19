const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [N, H] = fs.readFileSync(filePath).toString().trim().split('\n')

H = H.split(' ').map(Number).sort((a, b) => a - b)

if (H.length % 2 === 0) {
  console.log(H[(H.length / 2) - 1])
} else {
  console.log(H[Math.floor(H.length / 2)])
}