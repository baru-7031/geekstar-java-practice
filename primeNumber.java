import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number to Check it's prime or Not : ");
        int num = sc.nextInt();
        int i=2;
        while(i<num)
        {
            if (num%i==0)
                break;
            i++;
        }
        if (num == i)
            System.out.println(num + " is Prime Number.");
        else
            System.out.println(num + " is not Prime Number");
    }
}
