const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const [x, y] = input[0].split(' ').map(Number)
const arr = input[1].split(' ').map(Number)

console.log(arr.filter(e => e < y).join(' '))