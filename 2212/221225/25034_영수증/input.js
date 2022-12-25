const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const X = Number(input.splice(0, 1));
const N = Number(input.splice(0, 1));
let result = 0;

for (let i = 0; i < N; i++) {
  const [x, y] = input[i].split(' ').map(Number)
  result += x * y
}

X === result ? console.log('Yes') : console.log('No')