const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const [x, y, z] = fs.readFileSync(filePath).toString().trim().split(' ').map(Number).sort((a, b) => a - b);
x === y ? y === z ? console.log(10000 + x * 1000) : console.log(1000 + x * 100) : y === z ? console.log(1000 + z * 100) : console.log(z * 100)