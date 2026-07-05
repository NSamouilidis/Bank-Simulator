public class Loan {

    private double loanAmount;

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void confirmedLoan(Customer customer) {

        double income = customer.getIncome();
        int age = customer.getAge();
        double amount = this.loanAmount;

        if (age >= 18 && income >= 2000) {

            double interestRate;

            if (amount <= 10000) {
                interestRate = 0.03; // 3%
            } else if (amount <= 20000) {
                interestRate = 0.05; // 5%
            } else {
                interestRate = 0.10; // 10%
            }

            double interest = amount * interestRate;
            double totalToRepay = amount + interest;

            IO.println("Hello " + customer.getName());
            IO.println("Loan Approved!");
            IO.println("Loan Amount: $" + amount);
            IO.println("Interest Rate: " + (interestRate * 100) + "%");
            IO.println("Interest: $" + interest);
            IO.println("Total Amount to Repay: $" + totalToRepay);

        } else {
            IO.println("Sorry " + customer.getName() + ", your loan was not approved.");
        }
    }
}