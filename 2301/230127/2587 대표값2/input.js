const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n').map(Number).sort((a, b) => a - b);

console.log(((I[0] + I[1] + I[2] + I[3] + I[4]) / 5) + '\n' + I[2])