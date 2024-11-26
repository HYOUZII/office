import java.util.*;
class Isitright{
    void Whatnum(String val){
        int len = val.length();
        char[] arry = new char[len];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = val.charAt(i);
            
        }

        for (int i = 0; i < arry.length; i++) {
            if(arry[i]>='A' & arry[i]<='Z'){System.out.printf("%c",arry[i]+32);}
            else if(arry[i]>='a' & arry[i]<='z'){System.out.printf("%c",arry[i]-32);}
            else{System.out.printf("%c",arry[i]);}
        }        
    }
}

class Main {

    public static void main(String[] args) {
        String val;
        Scanner input = new Scanner(System.in);
        val = input.nextLine();
        input.close();

        Isitright Q1 = new Isitright();
        Q1.Whatnum(val);
    }
}