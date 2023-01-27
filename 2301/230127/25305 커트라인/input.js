const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [x, y] = fs.readFileSync(filePath).toString().trim().split('\n');
x = +(x.split(' ')[1])

console.log(y.split(' ').sort((a, b) => b - a)[x - 1])