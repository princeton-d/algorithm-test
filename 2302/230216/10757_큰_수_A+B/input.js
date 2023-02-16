const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [x, y] = fs.readFileSync(filePath).toString().trim().split(" ");

console.log(String(BigInt(x) + BigInt(y)))