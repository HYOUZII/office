import java.util.*;

class Isitright {
    void Whatnum(int n) {
        int a, b,flge = 0;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                if(n%i==0 & n==i){
                    System.out.println("wrong number");
                    break;
                }
                else if(n%i==0){
                    a = i;
                    b = n / i;
                    for (int j = 2; j <= a; j++) {
                        flge += (a%j==0 & a!=j) ? 1 : 0;
                    }
                    for (int k = 2; k <= b; k++) {
                        flge += (b%k==0 & b!=k) ? 1 : 0;
                    }
                    if (flge>=1) {
                        System.out.println("wrong number");
                        break;
                    }else{
                        System.out.println(a+" "+b);
                        break;
                    }
                }
            }
        }else {
            System.out.println("wrong number");
        }
    }
}

class Main {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.close();

        Isitright Q1 = new Isitright();
        Q1.Whatnum(num);
    }
}