import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0; // 입력 값 저장변수
        boolean isNotGood = false;

        // 유효한 입력을 받을 때까지 반복합니다.
        while (!isNotGood) {
        System.out.print("1부터 1000 사이의 정수를 입력하세요: "); // 사용자에게 입력 요청

            try {
                n = input.nextInt(); // 정수 값 읽기 시도

                // 입력값이 범위를 벗어나는지 확인
                if(n == 0) throw new Exception("0이 입력되면 프로그램을 종료합니다.");
                if (n < 1 || n > 1000) throw new IllegalArgumentException("입력값이 허용 범위를 벗어났습니다 (1-1000).");
                
                System.out.println("입력된 유효한 값: " + n);

            } catch (InputMismatchException e) {
                // 사용자가 정수가 아닌 다른 형태의 값을 입력했을 경우
                System.out.println("유효하지 않은 형식의 입력입니다. 정수만 입력해주세요.");
                input.next(); // 잘못된 입력을 버리고 다음 입력을 받을 수 있도록 합니다. (무한 루프 방지)

            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage() + " 다시 입력해주세요."); // 예외 메시지 출력 후 다시 입력 요청

            } catch (Exception e) {
                System.out.println("처리되지 않은 오류가 발생했습니다: " + e.getMessage());
                isNotGood = true;
            }
        }
        input.close(); // Scanner 자원을 해제합니다.
    }
}
