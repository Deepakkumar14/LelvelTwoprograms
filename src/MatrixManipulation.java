import java.util.Arrays;
import java.util.Scanner;

public class MatrixManipulation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row= input.nextInt();
        int col= input.nextInt();
        char a[][]=new char[row][col];

        String[] dictionary={"zoho","love","van","are","is"};
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                a[i][j]= input.next().charAt(0);
            }
        }
        int point=0;
        int count=0;
        for(int i=0;i<row;i++){
            char[] c=dictionary[point].toCharArray();
            System.out.println(Arrays.toString(c));
            int k=0;
            for(int j=0;j<col;j++){
                boolean bool=true;
                if(a[i][j]==c[k]){
                      k++;
                      count++;
                      while(k<c.length&&bool){
                          if(j<col-1&&a[i][j+1]==c[k]){
                              k++;
                              j++;
                              count++;
                          }
                          else if(i<row-1&&a[i+1][j]==c[k]){
                              k++;
                              i++;
                              count++;
                          }
                          else{
                              bool=false;
                          }
                      }
                      if(count==c.length){
                          System.out.println(dictionary[point]);
                          break;
                      }
                }
                point++;
                i=0;j=0;k=0;count=0;
            }
            }
        }
    }

//4
//4
//a z o l
//n x h o
//v y i v
//o r s e