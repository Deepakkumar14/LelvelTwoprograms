public class MinimumBinary {
    public static void main(String[] args) {
        int n=1020;
     while (n != 0)
    {
        int temp = n, m = 0, p = 1;
        while(temp != 0)
        {
            int rem = temp % 10;
           // System.out.println("temp%10  "+rem);
            temp = temp / 10;
           // System.out.println("temp/10  "+temp);
            if (rem != 0)
                m += p;
            p *= 10;
        }

        System.out.print(m + " ");
        n = n - m;
    }
        System.out.println(" ");
}
}
