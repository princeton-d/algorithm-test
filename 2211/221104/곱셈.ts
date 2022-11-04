/*
문제: (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
입력: 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
출력: 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
입력1: 
472
385
출력1: 
2360
3776
1416
181720
*/

const input = `472
385`;
const [input1, input2]: string[] = input.split('\n');
const input3: number = Number(input1);
const [num1, num2, num3]: number[] = input2.split('').map(Number);
const result1: number = input3 * num3;
const result2: number = input3 * num2;
const result3: number = input3 * num1;
console.log(`${result1}
${result2}
${result3}
${result1 + result2 * 10 + result3 * 100}`);
