public class largestNumber_without_and {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int num3 = 9;

        if (num1<num2)
        {
            if (num2<num3)
                System.out.println(num3 + " is Largest Number.");
            else
                System.out.println(num2 + " is Largest Number.");
        }
        else
        {
            if (num3<num1)
                System.out.println(num1 + " is Largest Number.");
            else
                System.out.println(num3 + " is Largest Number.");
        }
    }
}
