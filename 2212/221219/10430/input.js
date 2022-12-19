const fs = require('fs');
let [A, B, C] = fs.readFileSync(__dirname + '/input.txt').toString().split(' ').map(Number);
console.log(`${(A + B) % C}
${((A % C) + (B % C)) % C}
${(A * B) % C}
${((A % C) * (B % C)) % C}`);