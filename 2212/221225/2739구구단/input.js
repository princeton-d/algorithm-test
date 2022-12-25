const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const input = Number(fs.readFileSync(filePath).toString().trim())

for (let i = 1; i <= 9; i++) {
  console.log(`${input} * ${i} = ${input * i}`)
}