public class VisaCard extends CreditCard {

    public VisaCard(int debt) {
        super(debt);
    }

    @Override
    public void pay(int amount) {
        super.pay(amount / 100 * 90) ;
    }
}
