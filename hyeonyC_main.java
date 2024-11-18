import java.util.*;

class Main{

    public static void main(String[] args){
        int a,b, max;
        int sum=0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();

        max = a >= b ? a : b;
        for (int i = 1; i <= max ; i++) {
            if(i==a || i==b){
                sum = (i%2)!=0 ? sum+i/2+1 : sum+10*(i/2);
            }
        }

        System.out.println(sum);
    }
}