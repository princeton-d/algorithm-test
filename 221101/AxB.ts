/*
문제: 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력: 첫째 줄에 A×B를 출력한다.
입력1: 1 2
출력1: 2
입력2: 3 4
출력2: 12
*/

const input = '3 4';

const splitInput = input.split(' ', -1);
console.log(Number(splitInput[0]) * Number(splitInput[1]));
