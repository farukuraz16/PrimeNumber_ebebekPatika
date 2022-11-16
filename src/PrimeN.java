import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("Enter a number= ");//get number from user
        int num = dat.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {//forloop for all numbers until the number that taken from user

            for (int j = 2; j < i; j++) {//choose the number for dividing

                if (i % j == 0) count++;
            }
            if (count == 0) System.out.print(i + " ");

            count = 0;//reset the count..
        }

    }
}
