public class Customer {
    // Instance variables
    private String name;
    private int age;
    private double balance;

    // Constructor
    public Customer(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to charge the customer
    public void charge(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    // Method to credit the customer
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer("John Doe", 30, 1000.0);

        // Display customer information
        System.out.println("Name: " + customer.getName());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Balance: " + customer.getBalance());

        // Perform a charge and credit
        customer.charge(50.0);
        customer.credit(200.0);

        // Display updated balance
        System.out.println("Updated Balance: " + customer.getBalance());
    }
}
