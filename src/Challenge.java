import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String accountType = "Current";
        double currentBalance = 1599.99;
        int option = 0;


        System.out.println("\n========================  WELCOME TO STARKBANK  ========================");
        System.out.println("\nClient Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Your current balance is: " + "$" + currentBalance);
        System.out.println("\n*************************************************");

        String menu = """
                *** Please write the number of the option you want to select ***
                1 - Check balance
                2 - Withdraw
                3 - Deposit
                9 - Exit
                """;
        Scanner keyboard = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println("Your current balance is: "+ "$" + currentBalance);
                    break;
                case 2:
                    System.out.println("Please enter the amount to withdraw:");
                    double amountToWithdraw = keyboard.nextDouble();
                    if (currentBalance < amountToWithdraw){
                        System.out.println("Balance insufficient.");
                    }else{
                        currentBalance = currentBalance - amountToWithdraw;
                        System.out.println("Done. Your current balance is: " + currentBalance);
                    }
                case 3:
                    System.out.println("Please enter the amount to deposit:");
                    double amountToDeposit = keyboard.nextDouble();
                    currentBalance += amountToDeposit;
                    System.out.println("Your current balance is: "+ "$" + currentBalance);
                    break;
                case 9:
                    System.out.println("Thank you for using StarkBankApp ;)");
                    break;
                default:
                    System.out.println("Option not valid :/");
            }
        }
    }
}
