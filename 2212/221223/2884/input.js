const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
let [H, M] = fs.readFileSync(filePath).toString().trim().split(' ').map(Number);
M -= 45;
if (M < 0) {
  H--;
  M += 60;
  H >= 0 ? console.log(`${H} ${M}`) : console.log(`23 ${M}`);
} else {
  console.log(`${H} ${M}`)
}