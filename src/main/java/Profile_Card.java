import java.util.Scanner;

import static java.lang.System.*;

public class Profile_Card {
    public static void main(String[] args){
        Scanner sc=new Scanner(in);
        out.println("Name        : ");
        String name=sc.nextLine();
        out.println("Role        : ");
        String role=sc.nextLine();
        out.println("Location    : ");
        String location=sc.nextLine();
        out.println("Experience  : ");
        double experience=sc.nextDouble();


        out.println("==========================");
        out.println("      Profile Card        ");
        out.println("==========================");
        out.println("Name        : "+name);
        out.println("Role        : "+role);
        out.println("Location    : "+location);
        out.println("Experience  : "+experience);
        out.println("===========================");

    }
}
