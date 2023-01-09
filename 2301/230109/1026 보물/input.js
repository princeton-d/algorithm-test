const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [x, y, z] = fs.readFileSync(filePath).toString().trim().split('\n')
let result = 0;
y = y.split(' ').map(Number).sort((a, b) => a - b);
z = z.split(' ').map(Number).sort((a, b) => b - a);

for (let i = 0; i < Number(x); i++) {
  result += (y[i] * z[i]);
}
console.log(result)

// let I = require('fs').readFileSync('/dev/stdin').toString().trim()