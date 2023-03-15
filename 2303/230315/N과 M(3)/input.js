const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let [N, M] = fs.readFileSync(filePath).toString().trim().split(" ").map(Number);

const output = [];
let count = 0;
let result = "";

function dfs(count) {
  if (count === M) {
    result += `${output.join(" ")}\n`
    return;
  }

  for (let i = 0; i < N; i++) {
    output.push(i + 1);
    dfs(count + 1);
    output.pop();
  }
}

dfs(count);
console.log(result);