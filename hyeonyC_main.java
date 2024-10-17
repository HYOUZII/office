import java.util.*;
//[Class 41] 메소드의 매개변수에 대해서 배우자.
class Main{

    public static void getsum(int x, int y) {
        System.out.println(x + y);
    }



    public static void main(String[] args){
        // 함수는 class 안에 들어가야 한다.
        int a,b;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        input.close();

        getsum(a,b);
        
    }
}