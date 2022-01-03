import java.util.Scanner;

public class Sqrt {
    void square() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter your number : ");
        double c = obj.nextDouble();
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) ;
        {
            t = (c / t + t) / 2;
        }
    }
    public static void main(String[] args) {
        Sqrt squareRoot = new Sqrt();
        squareRoot.square();

    }
}
