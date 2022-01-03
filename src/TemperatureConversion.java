import java.util.Scanner;

public class TemperatureConversion {
    public static void temp() {
        float c, f;
        Scanner obj = new Scanner(System.in);
        System.out.println("Press enter 1 for celsius and 2 for fahrenheit : ");
        int number = obj.nextInt();
        switch(number) {
            case (1):
                System.out.println("Press enter your temperature in celsius : ");
                c = obj.nextInt();
                f = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit : " + f);
                break;
                case (2):
                System.out.println("Press enter your temperature in fahrenheit : ");
                float d = obj.nextInt();
                float celsius =(d-32) * (5/9);
                System.out.println("Temperature in celsius : " + celsius);
                break;
        }

    }
    public static void main(String[] args) {
        temp();
    }
}
