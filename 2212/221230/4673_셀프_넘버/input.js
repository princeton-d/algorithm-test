const arr = Array.from({ length: 10001 })

function d(n) {
  let num = n
  const splitNum = String(n).split('').map(Number)
  for (let i = 0; i < splitNum.length; i++) {
    num += splitNum[i]
  }
  return num
}

for (let i = 1; i <= 10000; i++) {
  d(i)
  arr[d(i)] = d(i)
}

for (let j = 1; j <= 10000; j++) {
  arr[j] === undefined ? console.log(j) : ''
}