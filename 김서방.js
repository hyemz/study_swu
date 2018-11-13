function solution(seoul) {
    var answer = '';
    var location;
    for (location = 0; location < seoul.length; location++)
        {
            if (seoul[location]=="Kim"){
            answer = '김서방은 ' + location + '에 있다';
            }
        }
    return answer;
}
console.log(solution(["Jane", "Yun", "Kim", "Park"]));