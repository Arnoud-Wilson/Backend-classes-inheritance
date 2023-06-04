public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Arnoud", "Wilson", new VisaCard(1));
        Customer customer2 = new Customer("Marjolein", "Wilson-Baas", new MasterCard(2));

        customer.printName();
        customer2.printName();

        System.out.println(customer.getCreditCard().getDebt());
        customer.getCreditCard().pay(5);
        System.out.println(customer.getCreditCard().getDebt());


        }
}
