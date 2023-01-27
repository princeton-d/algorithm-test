const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n');

I.shift()
console.log(I.sort((a, b) => a - b).join('\n'))