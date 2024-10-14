import java.util.Scanner;

class Main {
    public static void main(String[] args){
        final int current = 2012;
        int BirthYear, age;
        Scanner input = new Scanner(System.in);

        age = input.nextInt();
        input.close();

        BirthYear = current - age;
        System.out.println(BirthYear);
    }
}
