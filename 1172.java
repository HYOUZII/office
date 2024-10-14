/*import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        int first = 0, second = 0, third = 0;

        for (int i = 0; i < 3; i++) {
            number[i] = input.nextInt();
            if (first <= number[i]) {
                third = second;
                second = first;
                first = number[i];
                System.out.printf("f[%d]\ts[%d]\tt[%d]\n\n", first, second, third);
            } else if (second <= number[i]) {
                third = second;
                second = number[i];
                System.out.printf("f[%d]\ts[%d]\tt[%d]\n\n", first, second, third);
            } else {
                third = number[i];
                System.out.printf("f[%d]\ts[%d]\tt[%d]\n\n", first, second, third);
            }
        }
        input.close();
        System.out.print(third + " " + second + " " + first);

    }

}

*/