import java.util.Scanner;

public class Customer {
       private int age;
       private double income;
       private String name;
       private String address;
       private String email;
       private String phone;
       private String city;
       private String gender;
        public Customer(int age, double income, String name, String address, String email, String phone, String city, String gender) {
            this.age = age;
            this.income = income;
            this.name = name;
            this.address = address;
            this.email = email;
            this.phone = phone;
            this.city = city;
            this.gender = gender;
            Scanner input = new Scanner(System.in);
        }

     public int getAge() {return age;}
    public double getIncome() {return income;}
     public String getName() {return name;}
    public String getAddress() {return address;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getCity() {return city;}
    public String getGender() {return gender;}

    public void setIncome(double income) {this.income = income;}

    @Override
    public String toString() {
            return "Customer{name= "+ name + "age=" + age + "income= " + income + "phone= "+ phone + "address= "+ address + "email= "+ email + "gender= "+ gender + "}";}


}
