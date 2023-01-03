const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split('\n')
const T = Number(input[0])

for (let i = 1; i <= T; i++) {
  const [R, S] = input[i].split(' ')
  let result = ''
  for (let j = 0; j < S.length; j++) {
    for (let k = 0; k < Number(R); k++) {
      result += S[j]
    }
  }
  console.log(result)
  result = ''
}