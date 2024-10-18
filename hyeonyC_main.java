import java.util.*;
class Main{
    public static void BMI(){// 비만도 계산 함수
        float tall, weight;
        Scanner input = new Scanner(System.in);
        float obesity, strd_obesity_level;

        tall = input.nextFloat();   //입력단
        weight = input.nextFloat();
        input.close();              //입력해제
        
        strd_obesity_level = (float)((tall-100)*0.9);
        obesity = (float)(weight-strd_obesity_level)*100/strd_obesity_level;

        if (obesity<=10) {System.out.println("정상");} 
        else if (obesity>20){System.out.println("비만");}
        else{System.out.println("과체중");}

    }
    public static void main(String[] args){
        BMI();
    }
}