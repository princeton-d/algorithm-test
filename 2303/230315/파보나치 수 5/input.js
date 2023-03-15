const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = Number(fs.readFileSync(filePath).toString().trim());
let nextValue = 0;
let prevValue = 0;
let result = 1;

function calc(input) {
  if (input === 0) {
    return --result;
  } else if (input === 1) {
    return;
  }

  for (let i = 1; i < input; i++) {
    nextValue = result;
    result += prevValue;
    prevValue = nextValue;
  };
}

calc(input)
console.log(result);