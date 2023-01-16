const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n')
let money = 0
let [N, M] = I.splice(0, 1)[0].split(' ').map(Number)
let [S, O] = [1000, 1000]

for (let i = 0; i < M; i++) {
  const calc = I[i].split(' ').map(Number)
  calc[0] < S ? S = calc[0] : ''
  calc[1] < O ? O = calc[1] : ''
}

while (N > 0) {
  if (S > O * 6) {
    money = O * N
    break
  }

  if (N >= 6) {
    money += S
    N -= 6
  } else {
    if (N * O > S) {
      money += S
      N -= 6
    } else {
      money += N * O
      break
    }
  }
}
console.log(money)