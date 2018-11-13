function solution(array, commands) {
    var answer = [];
    var real_answer = [];
   for(var i = 0; i < commands.length; i++)
       {
            answer = array.slice(commands[i][0]-1,commands[i][1]);
          
           //정렬
           answer.sort(function(a, b) {
                return a - b;
            });
            real_answer.push(answer[commands[i][2]-1]);
       }   
    return real_answer;   
}

console.log(solution([1, 5, 2, 6, 3, 7, 4],[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
));