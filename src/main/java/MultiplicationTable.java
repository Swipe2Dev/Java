import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number table you need : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}
