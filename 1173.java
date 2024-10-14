/*import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int hour, minute;
        Scanner input = new Scanner(System.in);

        hour = input.nextInt();
        minute = input.nextInt();
        input.close();

        int past = hour * 60 + minute - 30;
        if (past<0)        past += 24*60;
        
        hour = past / 60;
        minute = past % 60;
        System.out.printf("%d %d",hour,minute);

    }

}
 */