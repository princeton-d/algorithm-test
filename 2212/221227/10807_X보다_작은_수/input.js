const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const [x, y, z] = fs.readFileSync(filePath).toString().trim().split('\n')

console.log(y.split(' ').filter(e => e == z).length)