import java.util.*;

class gugu{
    void AtoF(char some){
        int out = some-55;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n",out,i,out*i); 
        }
    }
}

class Main{
    public static void main(String[] args){
        char some;
        gugu testgugu = new gugu();
        Scanner input = new Scanner(System.in);
        some = input.next().charAt(0);
        input.close();

        if ('A'<=some & some <= 'F') {
            testgugu.AtoF(some);
        }

    }
}