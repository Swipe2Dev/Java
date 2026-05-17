public class Questions_Day1 {

    public static void main(String[] args) {
        System.out.println("1. What is JVM?");
        System.out.println("JVM (Java Virtual Machine) is the engine that runs Java programs.");
        System.out.println("It converts bytecode into machine code and executes it.");
        System.out.println();

        System.out.println("2. Why is Java platform independent?");
        System.out.println("Java is platform independent because it is compiled into bytecode.");
        System.out.println("The same bytecode can run on any system that has a JVM.");
        System.out.println();

        System.out.println("3. Difference between int and double:");
        System.out.println("int is used to store whole numbers.");
        System.out.println("double is used to store decimal numbers.");

        int age = 21;
        double price = 99.99;

        System.out.println("Example int value: " + age);
        System.out.println("Example double value: " + price);
        System.out.println();

        System.out.println("4. What is a variable?");
        System.out.println("A variable is a named container used to store data.");

        String name = "Kausalya";
        System.out.println("Example variable name: " + name);
        System.out.println();

        System.out.println("5. Why does Java need a main() method?");
        System.out.println("The main() method is the starting point of every Java program.");
        System.out.println("JVM starts executing the program from the main() method.");

        System.out.println("1. What is modulus operator?");
        System.out.println("Answer:");
        System.out.println("The modulus operator (%) gives the remainder after division.");
        System.out.println("Example: 10 % 3 = 1");
        System.out.println();

        System.out.println("2. Difference between while and for?");
        System.out.println("Answer:");
        System.out.println("FOR loop:");
        System.out.println("- Used when the number of iterations is known.");
        System.out.println("- Initialization, condition, and update are written in one line.");
        System.out.println();
        System.out.println("WHILE loop:");
        System.out.println("- Used when the number of iterations is unknown.");
        System.out.println("- Condition is checked before each iteration.");
        System.out.println();

        System.out.println("3. What is an infinite loop?");
        System.out.println("Answer:");
        System.out.println("An infinite loop is a loop that never stops because its condition always remains true.");
        System.out.println("Example:");
        System.out.println("while(true) {");
        System.out.println("    System.out.println(\"Hello\");");
        System.out.println("}");
        System.out.println();

        System.out.println("4. Why are conditions important in programming?");
        System.out.println("Answer:");
        System.out.println("Conditions help programs make decisions.");
        System.out.println("They allow the program to check situations and perform different actions.");
        System.out.println("Example: checking age eligibility, password validation, or number comparisons.");
    }
}