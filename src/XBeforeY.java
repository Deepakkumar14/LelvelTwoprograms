public class XBeforeY {
    public static void main(String[] args) {
        String s = "abcdefdefabcdefabc";
        String x = "def";
        String y = "abc";
        String[] a=s.split("abc");
        int count=0;
        int mainCount=0;
        int k=0;
        int j=0;
         for(int i=0;i<a.length;i++){
             System.out.println(String.valueOf(a[0]));
             if(a[i].charAt(j)==x.charAt(k)){
                 j++;
                 k++;
                 count++;
                 while(j<(a[i].length())&&a[i].charAt(j)==x.charAt(j)){
                     count++;
                     j++;k++;
                     if(count==x.length()){
                         mainCount++;
                         count=0;
                         k=0;
                     }
                 }
                 System.out.println(mainCount);
             }
         }
    }
}
