const fs = require('fs');
let [x, y] = fs.readFileSync(__dirname + '/input.txt').toString().split(' ').map(Number);
console.log(x - y);