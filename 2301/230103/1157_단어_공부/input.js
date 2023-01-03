const fs = require('fs')
const filePath = process.platform === "linux" ? '/dev/stdin' : __dirname + '/input.txt'
const input = fs.readFileSync(filePath).toString().trim().toUpperCase().split('').sort()
const str = [... new Set(input)]
let result = []
for (let i = 0; i < str.length; i++) { result.push(input.filter(item => item === str[i]).length) }
result.indexOf(Math.max(...result)) !== result.lastIndexOf(Math.max(...result)) ? console.log('?') : console.log(str[result.indexOf(Math.max(...result))])