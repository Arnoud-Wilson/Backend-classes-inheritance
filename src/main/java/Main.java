public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Arnoud", "Wilson", new VisaCard(0));
        Customer customer2 = new Customer("Marjolein", "Wilson-Baas", new MasterCard(0));

        customer.printName();
        customer2.printName();

        System.out.println(customer.getCreditCard().getDebt());
        customer.getCreditCard().pay(100);
        System.out.println(customer.getCreditCard().getDebt());

        System.out.println(customer2.getCreditCard().getDebt());
        customer2.getCreditCard().pay(100);
        System.out.println(customer2.getCreditCard().getDebt());


        }
}
