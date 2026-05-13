import java.util.Scanner;

public class Profile_Card {
    public static void main(String[] args){

        System.out.println("==========================");
        System.out.println("      Profile Card        ");
        System.out.println("==========================");
        Scanner sc=new Scanner(System.in);
        System.out.print("Name        : ");
        String name=sc.nextLine();
        System.out.print("Role        : ");
        String role=sc.nextLine();
        System.out.print("Location    : ");
        String location=sc.nextLine();
        System.out.print("Experience  : ");
        double experience=sc.nextDouble();
        System.out.println("===========================");

    }
}
