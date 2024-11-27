import java.util.*;

class cipher {
    void Caesar(String in){
        char[] brutus = new char[in.length()];
        for (int i = 0; i < brutus.length; i++) {
            brutus[i] = in.charAt(i);
        }

        for (int i = 0; i < brutus.length; i++) {
            if (brutus[i]>='a' & brutus[i]<='c') {
                System.out.printf("%c",brutus[i]+23);
            }
            else if(brutus[i]==32){
                System.out.printf("%c",brutus[i]);
            }
            else{
                System.out.printf("%c",brutus[i]-3);
            }
        }

    }    
}
class Main {
    public static void main(String[] args){
        Scanner getScanner = new Scanner(System.in);
        String input = getScanner.nextLine();
        getScanner.close();

        cipher codCipher = new cipher();
        codCipher.Caesar(input);
    }
    
}