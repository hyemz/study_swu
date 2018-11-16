function getDayName(a, b) {
    var answer = '';
    var day = ["SUN","MON","TUE","WED","THU","FRI","SAT"];
    var c = 0;
    
    if (a){
        if (a == 2 || a == 8){
            c = b%7;
        }
        else if (a == 3 || a == 11){
        c = b%7+1;
        }
        else if (a == 6){
        c = b%7+2;
        }
        else if (a == 9 || a == 12){
        c = b%7+3;
        }
        else if (a == 10){
        c = b%7+5;
        }
        else if (a == 5){
        c = b%7+6;
        }
        else {
        c = b%7+4;
        }
        if (c > 6){
            c = c-7;
        }
        answer = day[c];
    }
    return answer;
}
    
    console.log(getDayName(5,24));
