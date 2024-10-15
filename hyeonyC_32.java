// import java.util.*;

// class Main {
//     public static void main(String[] args){
//         int start, end, answer;
//         int correct=0;
//         start = 50;
//         end = 60;
        
//         Scanner input = new Scanner(System.in);

//         for(int i=0 ; i<3 ; i++){
//             int quiz1 = (int)(Math.random()*(end-start+1)) + start;
//             int quiz2 = (int)(Math.random()*(end-start+1)) + start;
//             System.out.printf("no %02d.  %2d + %2d = ",i,quiz1,quiz2);

//             answer = input.nextInt();
//             if (answer == quiz1 + quiz2) {
//                 correct++;
//                 System.out.println("[ 정답 ]");
//             }else{
//                 System.out.println("[ 오답 ]");
//             }
//         }

//         input.close();
//         System.out.println(correct+"개 맞혔습니다.");
//     }
// }
