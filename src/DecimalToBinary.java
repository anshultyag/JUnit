import java.util.Scanner;

public class DecimalToBinary {
    static void decToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PlEASE ENTER YOUR NUMBER : ");
        int n= sc.nextInt();
        int[] binaryNum = new int[100];
        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        obj.decToBinary();
    }
}