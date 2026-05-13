import java.util.Scanner;

public class Calculator {
//
//    static int add(int a,int b){return a+b;}
//    static int sub(int a,int b){return a-b;}
//    static int mul(int a,int b){return a*b;}
//    static int div(int a,int b){return a/b;}
//    static int mod(int a,int b){return a%b;}


    public static void main(String[] args){
//        int a=3;
//        int b=6;
//
//        //Addition
//        int Add=a+b;
//        System.out.println(a+b);
//        //Subtraction
//        int Sub=a-b;
//        System.out.println(a-b);
//        //Multiplication
//        int Mul=a*b;
//        System.out.println(a*b);
//        //Division
//        int Div=a/b;
//        System.out.println(a/b);


        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number 1:");
//        int a=sc.nextInt();
//
//        System.out.println("Enter number 2:");
//        int b=sc.nextInt();
//
//        System.out.println("Enter Operation(+, -, *, /, % )or e for exit: ");
//                char op=sc.next().charAt(0);

        //Taking Input from user
        //using if-else
//        if(op=='+')
//        {
//            System.out.println(n+m);
//        }
//        else if(op=='-')
//        {
//            System.out.println(n-m);
//        }
//        else if(op=='*')
//        {
//            System.out.println(n*m);
//        }
//        else if(op=='/')
//        {
//            System.out.println(n/m);
//        }
//        else if(op=='%')
//        {
//            System.out.println(n%m);
//        }
//        sc.close();


        //Using Switch
//        switch(op) {
//            case '+':
//                System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//                System.out.println(a * b);
//                break;
//            case '/':
//                System.out.println(a / b);
//                break;
//            case '%':
//                System.out.println(a % b);
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
//        sc.close();

        //Using Methods

//        switch(op){
//            case '+': System.out.println(add(a,b));
//            break;
//            case '-': System.out.println(sub(a,b));
//            break;
//            case '*': System.out.println(mul(a,b));
//            break;
//            case '/': System.out.println(div(a,b));
//            break;
//            case '%': System.out.println(mod(a,b));
//            break;
//            default: System.out.println("Invalid Operation");
//            break;
//        }

        //Using Loops

        while(true){
            System.out.println("Enter number 1:");
            int a=sc.nextInt();

            System.out.println("Enter number 2:");
            int b=sc.nextInt();

            System.out.println("Enter Operation(+, -, *, /, % )or e for exit: ");
            char op=sc.next().charAt(0);

            if(op=='e')
                break;

            switch(op) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
            }
        }
        }


