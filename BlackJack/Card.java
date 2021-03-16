import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
public class Card {
    int count=0;
    List<Integer> list = new ArrayList<Integer>();
    public Card(){
        for(int i = 1;i <= 52;i++ ){
            list.add(i);
        }
          Collections.shuffle(list);
    }
     public int card(){
        int aaa = list.get(this.count);
        this.count++;
       if(aaa%13==0){
        return 10;
       }
       else if(aaa%13==1){
         return 11;
       }
       else if(aaa%13 >= 11){
        return  10;
       }
       else{
        return aaa%13;
       }
     } 

}