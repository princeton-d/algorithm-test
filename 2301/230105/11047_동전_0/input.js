const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim().split('\n')
let [N, K] = I[0].split(' ').map(Number)
I = I.map(Number)
let C = 0

while (1) {
  if (I[N] <= K) {
    break
  }
  N--
}

while (1) {
  if (I[N] <= K) {
    K -= I[N]
    C++
  } else {
    N--
  }

  if (K === 0) {
    console.log(C)
    break
  }
}