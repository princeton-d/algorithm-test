/*
문제: 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
출력: 시험 성적을 출력한다.
입력1: 100
출력1: A
*/

const input = '100';
const input1 = Number(input);

if (input1 > 89) {
  console.log('A');
} else if (input1 > 79) {
  console.log('B');
} else if (input1 > 69) {
  console.log('C');
} else if (input1 > 59) {
  console.log('D');
} else {
  console.log('F');
}
