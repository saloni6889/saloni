//wwwwwwwwwwwwwwwwwImplement an interface for a real-world example, such as a payment gateway.

package Lab_CoreJava;

interface PaymentGateway {
 void processPayment(double amount);
}
class CreditCardPayment implements PaymentGateway {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
 }
}
public class PaymentGateway10_3 {
 public static void main(String[] args) {
     PaymentGateway payment = new CreditCardPayment();
     payment.processPayment(100.00); 
 }
}
