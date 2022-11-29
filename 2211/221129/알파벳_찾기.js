const input = `baekjoon`;
const x = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
const result = [];

for (let i = 0; i < x.length; i++) {
  result.push(input.indexOf(x[i]))
}
console.log(result);