const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = BigInt(+fs.readFileSync(filePath).toString().trim())
let num = 0;
let plus = 0;

while (I >= num) {
  num += plus;
  plus++
}
console.log(String(plus - 2))