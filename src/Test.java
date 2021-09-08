public class Test {
    public static void main(String[] args) {
        String str1="fffoxoxoxfxo";
        String temp="";
        int StartIndex=2;
        int endIndex=4;
        for(int l=0;l<str1.length();l++){
            if(!(l<StartIndex && l>endIndex)) {
                temp += str1.charAt(l);
            }
        }
        System.out.println(temp);
    }
}
