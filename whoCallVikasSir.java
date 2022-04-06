import java.util.Scanner;

public class whoCallVikasSir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name to Check you have Permission to video Call or Not :");
        System.out.print("\nEnter Your Name : ");
        String name = sc.nextLine();
        int count=0;
        String[] nameArr = new String[]{"subham", "rahul", "sandip","rohit"};
        //Checking place
        String nameCopyLower = name.toLowerCase();
        for (String x : nameArr)
        {
            if (nameCopyLower.matches(x.toLowerCase()))
            {
                System.out.println(name + " You have Permission to Video call 'vikas' sir");
                count++;
            }
        }
        if (count == 0)
            System.out.println(name + " SORRY you dosen't have permission to video call 'vikas' sir");
    }
}
