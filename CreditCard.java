public class CreditCard {
    public static void checkEligibility(Customer customer) {
        double income =customer.getIncome();
        int age = customer.getAge();
        if (age >= 18 && income >= 2000) {
            IO.println(customer.getName() +"is eligible for a credit card");
        }
        else {
            IO.println(customer.getName() +"is not eligible for a credit card");
        }

    }
}
