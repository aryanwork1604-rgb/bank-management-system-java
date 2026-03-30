class Account {
    int id;
    double balance;
    String name;

    Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println(id + " " + name + " " + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int id, double balance, String name) {
        super(id, balance, name);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}