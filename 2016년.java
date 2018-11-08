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
      switch (x) {
      case 0 : first_day=day[0];
                   break;
      case 1 : first_day=day[1];
                   break;
      case 2 : first_day=day[2];
                   break;
      case 3 : first_day=day[3];
                break;
      case 4 : first_day=day[4];
                 break;
      case 5 : first_day=day[5];
                 break;
      default : first_day=day[6];
                   break;
      }
      System.out.println(first_day);
      
      return answer;
  }
}
