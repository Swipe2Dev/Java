import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age and check whether you are eligible for voting :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
    }
}
