class PaymentGateway{
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Payment Method by Credit Card/Debit Card");
		System.out.println("Card Number: "+cardNumber);
		System.out.println("Expiry Date: "+expiryDate);
		System.out.println("CVV        : "+cvv);
	}
	public void makePayment(String upiid) {
		System.out.println("Payment Method by UPIID");
		System.out.println("UPIID "+upiid);
	}
	public void makePayment(double amount) {
		System.out.println("Payment Method by Cash On Delivery");
		System.out.println("Amount: "+amount);
		
	}
	
}
public class ECommerceApp {
	public static void main(String[] args) {
		PaymentGateway s1 = new PaymentGateway();
		s1.makePayment("4334 3424 2432 3245","11/26","799");
		PaymentGateway s2 = new PaymentGateway();
		s2.makePayment("akku@oksbi");
		PaymentGateway s3 = new PaymentGateway();
		s3.makePayment(3000.000);
		
}}
