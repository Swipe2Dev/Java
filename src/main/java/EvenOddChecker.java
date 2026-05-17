import java.util.Scanner;

public class EvenOddChecker {
    public boolean checkEvenOdd(int a, int b) {
        if (a % b == 0) {
            System.out.println("The number is even.");
            return true;
        }
        System.out.println("The number is Odd.");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter another number : ");
        int b = sc.nextInt();
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        evenOddChecker.checkEvenOdd(a, b);

    }
}
