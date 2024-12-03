class DoSomething{
    String name;
    int kor, eng, mat;
    double avg;
    char grade;

    DoSomething(){
        System.out.println("null");
    }
    DoSomething(String _name, int _kor, int _eng, int _mat){
        name = _name;
        kor  = _kor;
        eng  = _eng;
        mat  = _mat;
        System.out.println("do something to do.");
    }
}

class Main{
    public static void main(String[] args){
        DoSomething act = new DoSomething("홍길동",78,100,97);        
    }
}