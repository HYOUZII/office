// 단순반복문 연습
import java.util.*;

class Main{
    public static void watingzero(){
        int num = 1;
        Scanner input = new Scanner(System.in);
        
        do {
            num = input.nextInt();
            if(num==0){break;}
            else{System.out.println(num);}     
        } while (num != 0);
        
        
        input.close();
    }
    public static void main(String[] args){
        watingzero();
    }
}