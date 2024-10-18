import java.util.*;
class Main{
    //[Class 43] 메소드의 활용.
    // public static int ajja(){

    //     return 0;
    // }

    //[1222] 축구의 신 2
    public static int GOD(int time, int A){
        int result = A;
        for(int i=0 ; i<90-time ; i+=5){
            
            System.out.println("goal!!");
            result++;
            
        }
        return result;
    }

    public static void main(String[] args){
        
        int add1,current, Class1=5, Class2=7;
        Scanner input = new Scanner(System.in);

        current = input.nextInt();
        add1 = input.nextInt();
        Class2 = input.nextInt();
        input.close();

        Class1 = GOD(current, add1);
        System.out.println(Class1+" : "+Class2);

        if (Class1 >= Class2) {
            if (Class1 == Class2){System.out.println("same");}
            else{System.out.println("win");}
        } else {System.out.println("lose");}
    }
}