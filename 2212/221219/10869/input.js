const fs = require('fs');
let [x, y] = fs.readFileSync(__dirname + '/input.txt').toString().split(' ').map(Number)
console.log(`${x + y}
${x - y}
${x * y}
${Math.floor(x / y)}
${x % y}`)