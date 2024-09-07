import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int working;

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        
        
        do {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Exponential");

            
            System.out.print("\nEnter the First Number : ");
            int first_num = sc.nextInt();
            System.out.print("\nEnter the Second Number: ");
            int second_num = sc.nextInt();
            

            int chosen = sc.nextInt();

            if(chosen == 1) {
                System.out.println("\nAddition of both numbers : "+ (first_num + second_num));
            }
            else if(chosen == 2) {
                System.out.println("\nSubtraction of both numbers : "+ (first_num - second_num));
            }
            else if(chosen == 3 ) {
                System.out.println("\nMultiplication of both numbers : "+ (first_num * second_num));
            }
            else if(chosen == 4) {
                System.out.println("\nDivision of both numbers : "+ (first_num / second_num));
            }
            else if(chosen == 5) {
                System.out.println("\n"+ first_num + " to the power of "+ second_num + " : "+ (Math.pow(first_num, second_num)));
            }

            System.out.println("\nPress 1 for continue or 0 to stop");
            System.out.print("Want to continue "+ (name) +" : ");
            working = sc.nextInt();
        } while(working != 0);
    }
}