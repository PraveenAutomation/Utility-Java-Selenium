import java.util.Scanner;

public class KboatSpecialNum
{
    public static int fact(int y) {
        int f = 1;
        for (int i = 1; i <= y; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        int t = num;
        int sum = 0;
        while (t != 0) {
            int d = t % 10;
            sum += fact(d);
            t /= 10;
        }

        if (sum == num)
            System.out.println(num + " is a special number");
        else
            System.out.println(num + " is not a special number");

    }
}