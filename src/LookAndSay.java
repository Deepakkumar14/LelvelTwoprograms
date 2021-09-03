public class LookAndSay {
    public static void main(String[] args) {
        int n=6;
        String value="1";
        int totalcount=0;
        for(int i=1;i<=n;i++){
            String temp="";
            int count=1;
            if(i==1){
                System.out.println("1");
                totalcount+=1;
            }
            else{
                int len=value.length();
                String str="";
                for(int j=0;j<len;j++){
                    temp+=value.charAt(j);
                    while(j<value.length()-1 && value.charAt(j)==value.charAt(j+1)){
                        count++;
                        j++;
                    }
                    System.out.print(count+" "+temp+" ");
                    totalcount=totalcount+count+Integer.parseInt(temp);
                    str+=count;
                    str+=temp;
                    temp="";
                    count=1;
                }
                value="";
                value+=str;
                System.out.println();
            }
        }
        System.out.println(totalcount);
    }
}
