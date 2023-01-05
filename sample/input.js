const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
let I = fs.readFileSync(filePath).toString().trim()


// let I = require('fs').readFileSync('/dev/stdin').toString().trim()