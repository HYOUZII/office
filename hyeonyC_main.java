class calculator {
    int[] cnt = new int[5];

    double sum(double n1, double n2) {
        cnt[0]++;
        System.out.println(cnt[0] + "번 실행함.");
        return n1 + n2;
    }

    double sub(double n1, double n2) {
        cnt[1]++;
        System.out.println(cnt[1] + "번 실행함.");
        return n1 - n2;
    }

    double mul(double n1, double n2) {
        cnt[2]++;
        System.out.println(cnt[2] + "번 실행함.");
        return n1 * n2;
    }

    double div(double n1, double n2) {
        cnt[3]++;
        System.out.println(cnt[3] + "번 실행함.");
        return n1 / n2;
    }

    double power(double n1, double n2) {
        double val = 1;
        cnt[4]++;
        System.out.println(cnt[4] + "번 실행함.");
        for (int i = 0; i < n2; i++) {
            val *= n1;
        }
        return val;
    }

    void printor() {
        System.out.println("\n\n <<연산 횟수 출력 결과>> \n\n");
        System.out.println("덧셈 : " + cnt[0] + "회");
        System.out.println("뺄셈 : " + cnt[1] + "회");
        System.out.println("곱셈 : " + cnt[2] + "회");
        System.out.println("나눗셈 : " + cnt[3] + "회");
        System.out.println("거듭제곱 : " + cnt[4] + "회");
    }
}

public class hyeonyC_main {

    public static void main(String[] args) {
        calculator C1 = new calculator();

        System.out.println(C1.sub(1, 2));
        System.out.println(C1.sub(5, 1));
        System.out.println(C1.power(2, 2));

        C1.printor();
    }
}