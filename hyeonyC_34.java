// import java.util.*;

// class hyeonyC_34 {
//     public static void main(String[] args) {
//         // 랜덤된 수를 배열에 저장하고 저장된 값으로 평균 구하기
//         int i, j, avg = 0;
        
//         int[] arry = new int[10];
//         Scanner input = new Scanner(System.in);
//         input.close();

//         for (i = 0; i < arry.length; i++) { // 랜덤 값 입력
//             arry[i] = (int) (Math.random() * 10);
//         }

//         for (j = 0; j < arry.length; j++) {
//             System.out.printf("[%d]\t",arry[j]);
//             avg += arry[j];
//             if (j % 10 == 9) System.out.println();
            
//         }

//         System.out.println(arry.length + "개 랜덤 정수의 평균은 " + ((float) avg / arry.length));
//     }
// }