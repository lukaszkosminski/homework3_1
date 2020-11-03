public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(1);
        Client client1 = new Client("Mirek", "456456456", "Lakowa 2A");
        Pizza pizza1 = new Pizza(PizzaSize.big, PizzaType.Peperoni, 1);
        Drinks drink1 = new Drinks(DrinksType.juice, 1);

        order1.addClient(client1);
        order1.addPizza(pizza1);
        order1.addDrink(drink1);
        System.out.println(order1);



        Order order2 = new Order(2);
        Client client2 = new Client("Krysia", "456123789", "Nadrzeczna 6/3");
        Pizza pizza2 = new Pizza(PizzaSize.small, PizzaType.Hawaii, 1);
        Pizza pizza3 = new Pizza(PizzaSize.medium, PizzaType.Capriciosa, 1);
        Drinks drink2 = new Drinks(DrinksType.cola, 1);

        order2.addClient(client2);
        order2.addPizza(pizza2);
        order2.addPizza(pizza3);
        order2.addDrink(drink2);
        System.out.println(order2);

        Order order3 = new Order(3);
        Client client3 = new Client("Damian", "456123456", "Polna12");
        Hamburger hamburger1 = new Hamburger(HamburgerType.classic, HamburgerSize.medium, 1);
        Drinks drinks3 = new Drinks(DrinksType.beer, 1);

        order3.addClient(client3);
        order3.addHamburger(hamburger1);
        order3.addDrink(drinks3);
        System.out.println(order3);

        System.out.println("equals() czy pizza1 jest taka sama jak pizza2? " + pizza1.equals(pizza2));
        System.out.println("hashcode() hash pizza1: " + pizza1.hashCode() + " jest rozny od hash pizza2: " + pizza2.hashCode());
    }

}
