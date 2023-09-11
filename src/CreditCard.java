class CreditCard {

    public CreditCard(long number, int year, int month, String paymentSystem, Person holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.paymentSystem = paymentSystem;
        this.holder = holder;
    }

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