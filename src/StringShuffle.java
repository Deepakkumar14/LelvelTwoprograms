public class StringShuffle {
    public static void main(String[] args) {
        String str1="abc";
        String str2="def";
        String merge="dabcef";
        boolean bool=true;
        for(int i=0,index1=0,index2=0;i<merge.length();i++){
            if(index1<str1.length()&&merge.charAt(i)==str1.charAt(index1)){
                index1++;
            }
            else if(index2<str2.length()&&merge.charAt(i)==str2.charAt(index2)){
                index2++;
            }
            else{
                bool=false;
                break;
            }
        }
        if(bool)
            System.out.println("Valid shuffle");
        else
            System.out.println("Invalid shuffle");
    }
}
