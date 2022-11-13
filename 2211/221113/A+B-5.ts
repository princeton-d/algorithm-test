/*
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
입력의 마지막에는 0 두 개가 들어온다.
출력: 각 테스트 케이스마다 A+B를 출력한다.
입력1: 
1 1
2 3
3 4
9 8
5 2
0 0
출력1: 
2
5
7
17
7
*/

const input = `1 1
2 3
3 4
9 8
5 2
0 0`;
const splitInput: string[] = input.split(`\n`);

for (let i = 0; i < splitInput.length; i++) {
  const [x, y]: number[] = splitInput[i].split(' ').map(Number);
  x + y !== 0 ? console.log(x + y) : null;
}
