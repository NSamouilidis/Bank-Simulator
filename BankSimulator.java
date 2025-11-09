import java.util.Scanner;

public class BankSimulator {
    public static void main(String[] args) {
        double balance = 0;

        Scanner input = new Scanner(System.in);
        String userChoice2;

        IO.println("Welcome to FreeBank");

        while (true) {
            IO.println("Please select an operation: 1.Balance, 2.Withdrawal, 3.Deposit, 4.Exit");
            int userChoice = input.nextInt();

            if (userChoice == 1) {
                IO.println("Your balance is $" + balance);

            } else if (userChoice == 2) {
                IO.println("How much would you like to withdraw?");
                double amountW = input.nextDouble();

                if (amountW > balance) {
                    IO.println("You don't have enough balance");
                } else {
                    balance -= amountW;
                    IO.println("Your withdrawal is $" + amountW);
                    IO.println("Your new balance is $" + balance);
                }

            } else if (userChoice == 3) {
                IO.println("How much money would you like to deposit?");
                double amountD = input.nextDouble();
                balance += amountD;
                IO.println("Your deposit is $" + amountD);
                IO.println("Your new balance is $" + balance);

            } else if (userChoice == 4) {
                IO.println("Thanks for choosing FreeBank");
                break;

            } else {
                IO.println("Invalid choice, please select 1, 2, 3, or 4.");
            }

            while (true) {
                IO.println("Would you like to make another transaction? Yes or No");
                userChoice2 = input.next();

                if (userChoice2.equalsIgnoreCase("Yes")) {
                    break;
                } else if (userChoice2.equalsIgnoreCase("No")) {
                    IO.println("Thanks for using our Bank Simulator");
                    input.close();
                    return;
                } else {
                    IO.println("Maybe you misclicked, please type Yes or No.");
                }
            }
        }

        input.close();
    }
}
