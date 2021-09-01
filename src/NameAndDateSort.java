
import java.util.*;
import java.text.*;
public class NameAndDateSort
{
    public static void name(){

        List<String> names = Arrays.asList("Vishnu", "Dhatchu", "Janet", "Azhagu", "Saravanan");
        System.out.println("Before sorting: " + names);
        Collections.sort(names);      //to sort list
        System.out.println("After sorting: " + names);
    }

    public static void date() throws ParseException {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter no. of dates");
        int i;
        int n = sc.nextInt();
        String str[]= new String[n];
        Date date[]= new Date[n];
        sc.nextLine();
        for(i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        SimpleDateFormat sobj = new SimpleDateFormat("dd-MM-yyyy");
        for(i=0;i<n;i++)
        {
            date[i]=sobj.parse(str[i]);    //parse is used to convert string to date
        }
        Arrays.sort(date);     //to sort array
        System.out.println("Date after sorting");
        for(Date date1 : date)
        {
            System.out.println(sobj.format(date1));    //format is used to convert date to string
        }
    }
    public static void main(String[] args) throws ParseException {
        NameAndDateSort.name();
        NameAndDateSort.date();
    }
}
