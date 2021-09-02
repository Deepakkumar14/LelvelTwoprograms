public class ZeroFiveSixNumbers {
    public static void main(String[] args) {
        int n = 1000;
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            int temp1 = i, rem = 0,startCount = 0,endCount=0;
            while (temp1 > 0) {
                rem = temp1 % 10;
                startCount++;
                if (rem == 0 || rem == 5 || rem == 6) {
                    endCount++;
                }
                else{
                    break;
                }
                temp1 = temp1 / 10;
            }
            if (startCount == endCount) {
                System.out.print(i + " ");
                totalCount++;
            }
        }
        System.out.println();
        System.out.print(totalCount);
    }
}
