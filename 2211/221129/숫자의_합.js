const input = `11
10987654321`
const [x, y] = input.split('\n')
let result = 0;

for (let i = 0; i < x; i++) {
  const splitNum = y.split('').map(Number)
  result += splitNum[i]
}
console.log(result)