import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Zoho");
        alist.add("Karaikudi");
        add(alist);
        System.out.println(alist);

    }

    public static void add(ArrayList alist1) {
        alist1=new ArrayList(alist1);
        alist1.add("Zoho1");
        alist1.add("Karaikudi1");
        System.out.println(alist1);
    }

}
