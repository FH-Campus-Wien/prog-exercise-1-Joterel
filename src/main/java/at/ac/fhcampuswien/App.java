package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {


    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        String lineNumber = "0123456789012345678901";
        String lineRobot1 = "         __";
        String lineRobot2 = " _(\\    |@@|";
        String lineRobot3 = "(__/\\__ \\--/ __";
        String lineRobot4 = "   \\___|----|  |   __";
        String lineRobot5 = "       \\ }{ /\\ )_ / _\\";
        String lineRobot6 = "       /\\__/\\ \\__O (__";
        String lineRobot7 = "      (--/\\--)    \\__/";
        String lineRobot8 = "      _)(  )(_";
        String lineRobot9 = "     `---''---`";
        System.out.println(lineNumber);
        System.out.println(lineRobot1);
        System.out.println(lineRobot2);
        System.out.println(lineRobot3);
        System.out.println(lineRobot4);
        System.out.println(lineRobot5);
        System.out.println(lineRobot6);
        System.out.println(lineRobot7);
        System.out.println(lineRobot8);
        System.out.println(lineRobot9);
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int z = 'Z';
        int hexadecimal = 0xface;
        int octal = 012;
        int Long = (int) 80L;
        int Float1 = (int) 44e-1f;
        int Float2 = (int) 5.5f;
        int Double1 = (int) 8.88e1;
        int Double2 = (int) 99.9;

        int sum = z + hexadecimal + octal + Long + Float1 + Float2 + Double1 + Double2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println(sum);
    }


    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        System.out.println("Before Swap:");
        System.out.println("x: y:" + " After Swap:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }


    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();
        if(n1 > n2){
            System.out.print("n1 > n2");
        }
        else if(n1 < n2){
            System.out.print("n2 > n1");
        }
        else{
            System.out.print("n1 == n2");
        }
        System.out.println();
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();
        if (revenue < 0 || revenue >= 100000) {
            System.out.print("Invalid Revenue");
        }
        else if (revenue >= 0 && revenue < 20000){
            System.out.print("Poor Sales Revenue");
        }
        else if (revenue >= 20000 && revenue < 50000){
            System.out.print("Average Sales Revenue");
        }
        else if (revenue >= 50000 && revenue < 80000){
            System.out.print("Good Sales Revenue");
        }
        else if (revenue >= 80000 && revenue < 100000){
            System.out.print("Excellent Sales Revenue");
        }
        System.out.println();
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int commission = scanner.nextInt();
        if(commission == 1){
            System.out.print("Your Commission Rate was set to 0.01");
        }
        else if(commission == 2){
            System.out.print("Your Commission Rate was set to 0.02");
        }
        else if(commission == 3){
            System.out.print("Your Commission Rate was set to 0.03");
        }
        else if(commission == 4){
            System.out.print("Your Commission Rate was set to 0.04");
        }
        else if(commission == 5){
            System.out.print("Your Commission Rate was set to 0.05");
        }
        else{
            System.out.print("Your Commission Rate was set to 0.0");
        }
        System.out.println();
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.print("Leapyear");
        }
        else{
            System.out.print("Not a Leapyear");
        }
        System.out.println();
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if(number >999){
            return;
        }
        else{
            String result = "";
            String numberString = String.valueOf(number);
            for (int index = numberString.length()-1; index >= 0; index--) {
                result += numberString.charAt(index);
            }
            System.out.print(result + "\n");

        }
    }



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}