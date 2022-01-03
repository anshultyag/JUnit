import java.util.Scanner;
public class DayOfweek {
    public static void days() {
        boolean i = true;
        while (i) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your Day : ");
            int d = scanner.nextInt();
            if (d < 1 || d > 31) {
                System.out.println("Days are between 1 and 31");
                continue;
            }
            System.out.println("Please Enter your Month :");
            int m = scanner.nextInt();
            if (m < 1 || m > 12) {
                System.out.println("Months are between 1 and 12");
                continue;
            }
            System.out.println("Please Enter your Year : ");
            int y = scanner.nextInt();
            if (y < -10000 || y > 10000) {
                System.out.println("Years are between -10000 and 10000");
                continue;
            }

            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (int) (d + x + 31 * m0 / 12) % 7;

            System.out.println("The day of the week is: Sunday=0,...,Saturday=6 : " + d0);
           i=false;
        }
    }
        public static void main(String[] args) {

           days();
        }
    }
