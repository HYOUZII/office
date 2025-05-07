import java.util.*;

class Main{
    public static void main(String[] args) {
        // 먼저 입력될 데이터의 개수 n이 입력된다.
        // 두 번째로 공백을 기준으로 n개 데이터가 입력된다.
        // 1. 무한반복 됨
        // 2. 입력이 끝나면 종료 메세지를 출력하면서 변수를 초기화
        Scanner input = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("입력할 데이터의 수를 정수로 표현해주세요.");
                    int Max = input.nextInt();
                    System.out.println("입력될 데이터의 수는 \'"+Max+"\'입니다.");
                    int[] arr = new int[Max];
                    if (Max == 4 || Max == 0) {
                        System.out.println("프로그램을 정지합니다.");
                        break;
                    }

                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = input.nextInt();
                    }

                    for (int j = arr.length-1; j >= 0; j--) {
                        System.out.print(arr[j]+" / ");
                    }
                    System.out.println();
                    System.out.println("역순 출력을 마쳤습니다.\n\n\n");
                } catch (NegativeArraySizeException e) {    
                    System.out.println("0을 제외한 자연수를 입력해주세요.\n\n");
                }
                //finally{}
        }
        input.close();
    }
}
