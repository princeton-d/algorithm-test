/*
문졔: 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력: 첫째 줄에 A-B를 출력한다.

입력1: 3 2
출력1: 1
*/

const input = '3 2';

const splitInput = input.split(' ', -1);
console.log(Number(splitInput[0]) - Number(splitInput[1]));
