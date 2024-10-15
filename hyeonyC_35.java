// class Main{     // 정수를 랜덤으로 배열에 넣고 그중 최대값, 최소값을 구한다.
//     public static void main(String[] args){
//         int[] arry = new int[50];
//         int maximum = 0, minimum = 100;

//         for(int i=0 ; i<arry.length ; i++) {
//             arry[i] = (int)(Math.random() * 100);   // 0 ~ 100 까지 정수 입력
//             // maximum = arry[0];  minimum = arry[0]; 컴파일하기 전에 확정되지 않은 값으로 넣으면 안됨
//             System.out.printf("[%02d]\t",arry[i]);
//             if (i % 10 == 9) System.out.println();
//         }
//         for(int j=0 ; j<arry.length ; j++){
//             if (arry[j] >= maximum) maximum = arry[j];
//             if(arry[j] <= minimum) minimum = arry[j];
//         }

//         System.out.println("maximum is "+maximum+"\nand minimum is "+minimum);

//     }
// }