const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const [x, y] = fs.readFileSync(filePath).toString().split(`\n`).map(Number);

console.log(`${x * (y % 10)}
${x * (Math.floor(y / 10) % 10)}
${x * Math.floor(y / 100)}
${x * y}`)