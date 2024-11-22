
class triangle{// 이 안에 변수(instance variable), 메서드(instance method)를 넣는다.
    //instance variable
    double base, hight;

    // instance method
    void init(double b, double h){
        base = b;
        hight = h;
    }

    double getArea(){
        return base * hight / 2;
    }
}
class Main{

    public static void main(String[] args){
        triangle t1 = new triangle();
        triangle t2 = new triangle();
        
        t1.init(3, 5);
        t2.init(10, 91);

        System.out.println("t1삼각형의 넓이 = "+t1.getArea());
        System.out.println("t1삼각형의 넓이 = "+t2.getArea());
    }
}