//몰겠음 
import java.lang.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int key=0;
        int count=0;
        int arr[] = new int[100000];
        
        for(int i=0; i<participant.length; i++){
            for(int j=0; j<completion.length; j++){
               key=completion[j].indexOf(participant[i]);
               
               arr[j]=key;
                
               
              
               
               //중복되는 이름이 있을 경우
               for(int k=0; k<participant.length; k++){
                   if(arr[k]==key){
                       answer=participant[k];
                   }
               }
                if(key==-1){
                 answer=participant[i];
                 
                }
                 System.out.println("i="+i+"j="+j+" key 값은"+key+"count: "+count);
                key=0;
                count=0;
                
                System.out.println(answer);
            }
            
        }
        return answer;
    }
}
