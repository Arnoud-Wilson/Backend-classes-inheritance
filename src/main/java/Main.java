public class Main {

    public static void main(String[] args) {

        CreditCard creditCardArnoud = new CreditCard(123456789);
        CreditCard creditCardMarjolein = new CreditCard(987654321);

        Customer customer = new Customer("Arnoud", "Wilson", creditCardArnoud);
        Customer customer2 = new Customer("Marjolein", "Wilson-Baas", creditCardMarjolein);

        customer.printName();
        customer2.printName();





        }
}
