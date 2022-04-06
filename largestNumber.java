public class largestNumber {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int num3 = 9;

        //Checking for largest number or not
        if (num1<num2 && num2<num3)
            System.out.println(num3 + " is a Largest Number.");
        else if (num3<num1)
            System.out.println(num1 + " is a Largest Number.");
        else
            System.out.println(num3 + " is a Largest Number.");
    }
}
