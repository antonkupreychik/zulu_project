public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1l, 2022, 3, null,null);
        CardValidator cardValidator = new CardValidator();
        System.out.println(cardValidator.validate(creditCard));


    }
}