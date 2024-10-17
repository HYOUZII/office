// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int year = input.nextInt();
//         int month = input.nextInt();
//         input.close();

//         // 각 월의 일수를 배열로 정의
//         int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//         // 윤년 체크
//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//             daysInMonth[1] = 29; // 2월에 29일 추가
//         }

//         // 월 입력값이 유효한지 체크
//         if (month < 1 || month > 12) {
//             System.out.println("error");
//         } else {
//             System.out.println(daysInMonth[month - 1]); // 배열에서 일수 출력
//         }
//     }
// }