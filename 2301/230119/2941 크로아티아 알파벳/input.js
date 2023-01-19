const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim()

let str = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];

for (let i = 0; i < str.length; i++) {
  while (I.indexOf(str[i]) >= ' ') {
    I = I.replace(str[i], '0')
  }
}
console.log(I.split('').length)