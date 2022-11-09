/*
문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력: 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
입력1: 
5
1 1
2 3
3 4
9 8
5 2
출력1: 
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/

const input = `5
1 1
2 3
3 4
9 8
5 2`;
const [x, ...y] = input.split('\n');
for (let i = 0; i < Number(x); i++) {
  const test = y[i].split(' ').map(Number);
  console.log(`Case #${i + 1}: ${test[0] + test[1]}`);
}
