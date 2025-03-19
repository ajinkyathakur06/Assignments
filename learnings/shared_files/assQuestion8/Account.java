package assQuestion8;

public class Account {
	int acc_no;
    String acc_type;
    String name;
    double balance;

    public Account(int acc_no, String acc_type, String name, double balance) {
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
