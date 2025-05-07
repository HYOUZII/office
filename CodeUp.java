import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("입력할 수의 갯수는?");
        int Max = input.nextInt(); // k<=100 개가 입력됨.
        //System.out.println("갯수는 "+Max+"입니다.");
        int[] arr = new int[Max];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int token = 2;
        while (token > 0) {
            token--;
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
        input.close();
    }
}