const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim())
if (input > 99) {
  let result = 99
  for (let i = 100; i <= input; i++) {
    const [x, y, z] = String(i).split('').map(Number);
    (x - y) === (y - z) ? result++ : ''
  }
  console.log(result)
} else {
  console.log(input)
}