public class IncomeChecker {
    public static void CheckIncome(Customer customer) {
        double income = customer.getIncome();
        IO.println(customer.getName() + "'s income is " + income);

        if (income < 1000) {
            IO.println("Your income is low ");
        } else if (income > 1000 && income < 5000) {
            IO.println("Your income is medium ");
        } else {
            IO.println("Your income is high ");
        }
    }
}
