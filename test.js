const fs = require('fs');
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt';
const input = fs.readFileSync(__dirname + '/input.txt').toString().trim()

// let I = require('fs').readFileSync('/dev/stdin').toString().trim()
