import java.util.*;

public class CodeUp {

    public static void main(String[] args){
        int a,b,total=0;
        int max,min;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();        

        if (a>=b) {        max = a;             min = b;         } 
        else {             max = b;             min = a;        }

        for (int i = min; i <= max; i++) {
            if (i%2 == 0) { 
                total -= i; 
                System.out.print("-"+i);
            } else { 
                total += i; 
                //i == min ? System.out.print(i) : System.out.print("+"+i);
            }
        }

        System.out.print("="+total);
    }
}
