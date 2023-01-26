const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [z, ...I] = fs.readFileSync(filePath).toString().trim().split('\n');
const [x, y] = z.split(' ').map(Number)
let result = [];

for (let i = 0; i < x; i++) {
  const one = I[i].split(' ').map(Number)
  const two = I[i + x].split(' ').map(Number)
  for (let j = 0; j < y; j++) {
    result.push((one[j] + two[j]))
  }
}
console.log(result.join(' '))