// import java.util.*;
// class Main{// 입력된 2개 정수 사칙연산의 결과값 중에서 최대값을 찾는 문제
//     public static void main(String[] args){
//         int a, b;
//         double maximum = 0;
//         Scanner input = new Scanner(System.in);
//         a = input.nextInt();
//         b = input.nextInt();
//         input.close();

//         if (a+b>=maximum) {
//             maximum = a+b;
//         }
//         if (a-b>=maximum || b-a>=maximum) {
//             maximum = a-b > b-a ? a-b:b-a;
//         }
//         if(a*b>=maximum){
//             maximum = a*b;
//         }
//         if((a/b+a%b)>=maximum || (b/a+b%a) >= maximum){
//             maximum = (a/b+a%b) > (b/a+b%a) ? (a/b+a%b) : (b/a+b%a);
//         }
//         if(Math.pow(a,b)>=maximum || Math.pow(b,a) >= maximum){
//             maximum = Math.pow(a,b) > Math.pow(b,a) ? Math.pow(a,b) : Math.pow(b,a);
//         }
        
//         System.out.printf("%.6f",maximum);
//     }
// }