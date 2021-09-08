public class RemoveSubstring {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="pqr";
        String temp=str1;
        String output="";
        for(int i=0;i<temp.length();i++){
            int count=0;
            for(int j=0;j<str2.length();j++){
                if(temp.charAt(i)==str2.charAt(j)){
                    count++;
                    int StartIndex=i;int m=i+1;
                    int endIndex=i;
                    j++;
                    while(j<str2.length()&&(temp.charAt(m)==str2.charAt(j))){
                        m++;
                        j++;
                        count++;
                        endIndex++;
                    }
                    if(count==str2.length()){
                        output=temp;
                        temp="";
                        for(int l=0;l<output.length();l++){
                            if(!(l>=StartIndex && l<=endIndex)) {
                                temp += output.charAt(l);
                            }
                        }
                        i=-1;
                    }
                }
                break;
            }
        }
        System.out.println(temp);
        System.out.println(temp.length());
    }
}
