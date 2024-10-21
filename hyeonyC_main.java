//for문 새로운 작성법 배움

class Main{
    public static int evensumorOdd(int[] nums){
        int sum =0;
        for(int i : nums){
            if (i%2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arry = {1,2,3,87,3,4,6,88,8,3,4};
        System.out.println(evensumorOdd(arry));
    }
}