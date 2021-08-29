package Grandson;

import java.util.Scanner;

public class Grandson {
     private static  Scanner input=new Scanner(System.in);
    public static int row;
    public static int col;
    public static String[][] array;
    public static int count=0;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter row");
         row= input.nextInt();
        System.out.println("Enter col");
         col= input.nextInt();
         input.nextLine();
         array=new String[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                array[i][j]= input.nextLine();
            }
        }
        System.out.println("Enter grandfather name");
        String grandDad= input.nextLine();
        for(int i=0;i<row;i++){
            if(grandDad.equals(array[i][1])){
                String father =array[i][0];
                son(father);
            }
        }
        System.out.println("No of Grandson is  "+count);
    }

    public static void son(String father){

        for(int i=0;i<row;i++){
            if(father.equals(array[i][1])){
                String son =array[i][0];
                count++;
            }
        }
    }
}
