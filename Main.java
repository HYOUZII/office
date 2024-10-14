import java.util.*;

// This code is counting ages.
class Main {

    public static void main(String[] args){
        final int current = 2013;
        int BirthYear, age;
        Scanner input = new Scanner(System.in);

        age = input.nextInt();
        input.close();

        BirthYear = current - age;
        System.out.print((BirthYear)%100 + " ");

        if (BirthYear>=2000) {
            System.out.println(3);
        } else {
            System.out.println(1);
        }
    }

    /*public static void main(String[] args) {
        System.out.println("안녕하세요 주민번호 앞자리 6자리와 성별번호를 입력해주세요(공백구분)");

        int age;
        int[] list = new int[2];
        Scanner input = new Scanner(System.in);
        
        for (int i=0;i<2;i++) {
            list[i] = input.nextInt();
        }
        input.close();

        if(list[1]>=3){
            age = 13-(list[0]/10000);
        }
        else{
            age = 113-(list[0]/10000);
        }
        System.out.println(age);
    }*/
}
