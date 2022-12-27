const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const [x, y] = fs.readFileSync(filePath).toString().trim().split('\n')
const result = y.split(' ').map(Number).sort((a, b) => a - b)
console.log(`${result[0]} ${result[x - 1]}`)