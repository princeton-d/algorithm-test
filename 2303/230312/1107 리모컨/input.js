const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().split("\n")
const TARGET_CHANNEL = Number(input[0]);
const NUMBER_OF_CURRENT_CHANNEL = Number(input[1]);
const INOPERATIVE_NUMBER = input[2].split(" ").map(Number);
const CURRENT_ChANNEL = 100;
let result2 = []

const result1 = TARGET_CHANNEL - CURRENT_ChANNEL;
String(TARGET_CHANNEL).split('').forEach(num => {
  // if (INOPERATIVE_NUMBER.indexOf(Number(num))) {

  // } else {
  //   result2.push(num);
  // }

  console.log(INOPERATIVE_NUMBER.indexOf(Number(num)))
})