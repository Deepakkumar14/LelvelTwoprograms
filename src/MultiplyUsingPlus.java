public class MultiplyUsingPlus {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int min,max,sum=0;
        if(a>b) {
            min = b;
            max = a;
        }
        else {
            min = a;
            max=b;
        }
        for(int i=0;i<min;i++){
            sum+=max;
        }
        System.out.println("Answer is "+sum);
    }
}
