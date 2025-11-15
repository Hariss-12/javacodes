interface Payment {
    void pay(double amount);
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
       Payment p;
        p = new CreditCard();
        p.pay(500);
        p = new PayPal();
        p.pay(800);
        p = new Cash();
        p.pay(300);
    }
}
