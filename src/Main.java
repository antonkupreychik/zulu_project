public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1l, 2022, 3, null,null);
        CardValidator cardValidator = new CardValidator();
        System.out.println(cardValidator.validate(creditCard));


         /*    public CreditCard(long number, int year, int month, String paymentSystem, Person holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.paymentSystem = paymentSystem;
        this.holder = holder;
    }

    public CreditCard(long number, int year, int month, Person holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.holder = holder;
        this.paymentSystem = Main.PaymentSystemValidator.verifyPaymentSystem(number);
    }*/
    }
}