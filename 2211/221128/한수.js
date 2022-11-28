/*
문제: 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
입력: 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
출력: 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
입력1: 110
출력1: 99
입력2: 1
출력2: 1
입력3: 210
출력3: 105
입력4: 1000
출력4: 144
입력5: 500
출력5: 119
*/

const input = `500`;

Number(input) < 99 ? console.log(Number(input)) : start(input);

function start(num) {
  let result = 99;
  for (let i = 100; i <= Number(num); i++) {
    const splitNum = String(i).split('')
    Number(splitNum[1]) - Number(splitNum[0]) === Number(splitNum[2]) - Number(splitNum[1]) ? result++ : null;
  }
  console.log(result)
}
