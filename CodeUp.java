import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0; // 입력 값 저장변수
        boolean programEnd = false; // 프로그램 종료 조건 변수 추가

        // 유효한 입력을 받거나 종료 조건이 될 때까지 반복합니다.
        while (!programEnd) {
            System.out.print("1부터 1000 사이의 정수를 입력하세요 (0 입력 시 종료): "); // 사용자에게 입력 요청

            try {
                n = input.nextInt();

                if (n == 0) {
                    System.out.println("0이 입력되었습니다. 프로그램을 종료합니다.");
                    programEnd = true; // 종료 조건 설정
                    break; // while 루프 종료
                }

                if (n < 1 || n > 1000) {
                    throw new IllegalArgumentException("입력값이 허용 범위를 벗어났습니다 (1-1000).");
                }

                int[] arr = new int[n]; // n 크기의 배열 생성

                System.out.println(n + "개의 정수를 입력해주세요:");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = input.nextInt(); // n개의 정수를 배열에 입력받습니다.
                }

                System.out.println("\n--- 순환 이동 결과 ---");
                for (int i = 0; i < n; i++) { // i는 현재 줄의 '시작 인덱스' 역할을 합니다.
                    // 한 줄에 n개의 숫자를 출력합니다.
                    for (int j = 0; j < n; j++) {
                        // 출력할 숫자의 인덱스를 계산합니다.
                        // (시작 인덱스 + 현재 출력 순서)를 전체 개수(n)로 나눈 나머지
                        int current_index = (i + j) % n;

                        // 해당 인덱스의 숫자를 가져와서 출력합니다.
                        System.out.print(arr[current_index] + " ");
                    }
                    System.out.println(); // 한 줄 출력 후 줄 바꿈
                }
                // 순환 이동 출력이 성공하면 다시 입력을 받을 수 있도록 루프는 계속됩니다.

            } catch (InputMismatchException e) {
                // 사용자가 정수가 아닌 다른 형태의 값을 입력했을 경우
                System.out.println("유효하지 않은 형식의 입력입니다. 정수만 입력해주세요.");
                input.next(); // 잘못된 입력을 버리고 다음 입력을 받을 수 있도록 합니다. (무한 루프 방지)
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage() + " 다시 입력해주세요."); // 예외 메시지 출력 후 다시 입력 요청
            } catch (Exception e) {
                // 예상치 못한 다른 예외 발생 시
                System.out.println("처리되지 않은 오류가 발생했습니다: " + e.getMessage());
                programEnd = true;
            }
        }
        input.close(); // Scanner 자원을 해제합니다.
        System.out.println("프로그램이 종료되었습니다.");
    }
}
