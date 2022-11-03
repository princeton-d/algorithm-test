/*
문제: 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
입력: 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
입력1: 7 3
출력1:
10
4
21
2
1
*/

const input = '7 3';

const splitInput = input.split(' ', -1);
const a: number = Number(splitInput[0]);
const b: number = Number(splitInput[1]);

console.log(`${a + b}
${a - b}
${a * b}
${Math.floor(a / b)}
${a % b}`);
