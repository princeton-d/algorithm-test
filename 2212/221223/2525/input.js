const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const [x, y] = fs.readFileSync(filePath).toString().trim().split('\n');
let [H, M] = x.split(' ').map(Number);
const T = Number(y);
M += T;
if (M > 59) {
  const h = Math.floor(M / 60);
  H += h;
  H > 23 ? console.log(`${H - 24} ${M % 60}`) : console.log(`${H} ${M % 60}`);
} else {
  console.log(`${H} ${M}`);
}