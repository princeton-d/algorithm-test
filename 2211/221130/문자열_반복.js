const input = `2
3 ABC
5 /HTP`
const splitInput = input.split('\n')
let result = '';

for (let i = 1; i <= Number(splitInput[0]); i++) {
  result = '';
  const [x, y] = splitInput[i].split(' ')
  for (let j = 0; j < y.length; j++) {
    for (let k = 0; k < x; k++) {
      result += y[j]
    }
  }
  console.log(result)
}