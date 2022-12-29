const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n').map(Number)
const result = []

input.forEach(e => result.includes(e % 42) ? '' : result.push(e % 42))
console.log(result.length)