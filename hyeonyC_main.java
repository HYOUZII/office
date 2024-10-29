// 단순반복문 연습
import java.util.*;

class Main{
    public static void waitingQ(){
        char in;
        Scanner input = new Scanner(System.in);
        do {
            in = input.next().charAt(0);
            System.out.println(in);
        } while (in != 'q');
        input.close();
    }
    public static void main(String[] args){
        waitingQ();
    }
}