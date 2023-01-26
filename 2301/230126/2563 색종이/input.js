const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n')

let arr = new Array(100).fill().map(item => new Array(100).fill(false))

let result = 0;

for (let i = 1; i <= +(I[0]); i++) {
  const target = I[i].split(' ').map(Number);
  for (let j = 0; j < 10; j++) {

    for (let k = 0; k < 10; k++) {
      arr[(target[0] - 1 + j)][target[1] - 1 + k] = true;
    }
  }
}

arr.forEach(item => {
  result += item.filter(booleans => booleans === true).length
})

console.log(result)