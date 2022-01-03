import java.util.Scanner;

public class MonthlyPay {
    public static void monthly(int p, int y, int r) {
        int n = 12 * y;
        double R = r / (12 * 10);
        double payment = (p * r) / (1 - (1 + r) ^ (-n));
        System.out.println(payment);
    }

    public static void main(String[] args) {
        int p, y, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly payment: ");
        p = input.nextInt();
        System.out.print("Year : ");
        y = input.nextInt();
        System.out.print("Rate of intreset : ");
        r = input.nextInt();
        monthly(p, y, r);
    }
}