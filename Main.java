import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int year = myScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        myScanner.close();

    }

}
