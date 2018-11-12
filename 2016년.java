//내 풀이(부분 정답)
import java.util.*;
class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String day[]={"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int month_length[]={2,0,2,1,2,1,2,2,1,2,1,2};
      int month_margin=0;
      String first_day;
      
      --a;
      //해당 월 길이 구하기
      int month=month_length[a];
      month=month+29;
      //a=5이므로 5월의 길이는 31
      System.out.println(month);
      
      //해당 월의 1일 요일구하기, 4월까지 더해야하는 수 구하기
      for(int i=0; i<a; i++){
        month_margin=month_margin+month_length[i];
      }
      
      System.out.println(month_margin);
      
      int x=0;
      x=Math.abs(month_margin-7)-1;
      System.out.println(x);
      
      answer=day[b%7+x];
      return answer;
  }
}

//다른사람의 풀이(정답)
import java.util.*;
class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String day[]={"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int month_length[]={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int day_index=0;
      
      //4월까지 더해야하는 수 구하기
      for(int i=0; i<a-1; i++){
        day_index+=month_length[i];
      }
      
      //구한 값에 index값을 고려하여 b-1한 값을 더한다. 해당 월까지의 모든 일수를 더한 값임.
      day_index+=(b-1);
      //해당 월까지의 일수를 7로나눈 나머지를 index로 하여 요일을 구한다.
      answer=day[day_index%7];
      return answer;
  }
}
