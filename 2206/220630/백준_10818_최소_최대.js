// 문제
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

// 출력
// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

// 예제 입력 1
// 5
// 20 10 35 30 7
// 예제 출력 1
// 7 35

const input = `5
20 10 35 30 7`;

//배열 만들어주기
const splitInput = input.split("\n");
const arrayA = splitInput[0];
const arrayB = splitInput[1].split(" ").map(Number); // 스페이스바 기준으로 1개씩 자름
arrayB.sort((a, b) => a - b);
console.log(arrayB[0], arrayB[arrayA - 1]);
기;
