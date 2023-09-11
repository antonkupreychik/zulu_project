class CreditCard {
    long number;
    int year;
    int month;

    String paymentSystem;

    Person holder;

}

class Person {
    String name;
    String surname;
}

class CardValidator{
    public boolean validate(CreditCard card) {
        if(card.number == 0) {
            return false;
        }

        return true;
    }
}