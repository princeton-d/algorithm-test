const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('')

let count = 0;

I.forEach(item => {
  if (item === 'A' || item === 'B' || item === 'C') {
    count += 3
  } else if (item === 'D' || item === 'E' || item === 'F') {
    count += 4
  } else if (item === 'G' || item === 'H' || item === 'I') {
    count += 5
  } else if (item === 'J' || item === 'K' || item === 'L') {
    count += 6
  } else if (item === 'M' || item === 'N' || item === 'O') {
    count += 7
  } else if (item === 'P' || item === 'Q' || item === 'R' || item === 'S') {
    count += 8
  } else if (item === 'T' || item === 'U' || item === 'V') {
    count += 9
  } else if (item === 'W' || item === 'X' || item === 'Y' || item === 'Z') {
    count += 10
  }
})
console.log(count)