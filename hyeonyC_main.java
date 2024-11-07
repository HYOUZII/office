import java.util.*;

class Main{

    public static void main(String[] args){
        arrow();
    }    

    public static void arrow(){
        
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();// 시작값
        long m = input.nextLong();// 곱할값
        long d = input.nextLong();// 더할 값
        long n = input.nextLong();// 몇 번째
        input.close();
        long result=a;
        for(int i=1 ; i<n ; i++){
            result = result * m + d;
            System.out.println(result);
        }
        System.out.printf("%d",result);
    }
}