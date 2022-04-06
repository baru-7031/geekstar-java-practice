import java.util.Scanner;

public class userInput_largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3no To Check Which is the Largest Number :");
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int num3 = sc.nextInt();

        //Checking Place
        if (num1<num2 && num3<num2)
            System.out.println(num2 + " is Largest Number.");
        else if (num1<num3)
            System.out.println(num3 + " is Largest Number.");
        else
            System.out.println(num1 + " is Largest Number.");
    }
}
