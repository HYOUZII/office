import java.util.*;

public class CodeUp {

    public static void main(String[] args){
        int a,b,total=0;
        int max,min;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();        

        max = a>=b ? a : b;
        min = a+b-max;

        for (int i = min; i <= max; i++) {
            if (i%2 == 0) { 
                total -= i; 
                System.out.print("-"+i);
            } else { 
                total += i; 
                if(i == min) System.out.print(i);
                else System.out.print("+"+i);
            }
        }

        System.out.print("="+total);
    }
}
