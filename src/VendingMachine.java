import java.util.Scanner;

public class VendingMachine {
    public static void countCurrency(int amount) {
        int[] note = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int noteCount[] = new int[9];
        for (int i = 0; i < 9; i++) {
            if (amount >= note[i]) {
                noteCount[i] = amount / note[i];
                amount = amount - noteCount[i] * note[i];
                System.out.println("Note of " + note[i] + " is : " + noteCount[i]);
            }
        }
    }
    public static void main(String argc[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = obj.nextInt();
        countCurrency(amount);
    }
}
