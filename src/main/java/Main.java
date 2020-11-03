public class Main {

    public static void main(String[] args){

       Order order1 = new Order(1);
       Client client1 = new Client("Mirek","456456456","Lakowa 2A");
       Pizza pizza1 = new Pizza(PizzaSize.large,PizzaType.Peperoni, 1);
       Drinks drink1 = new Drinks(DrinksType.juice,1);

       order1.addClient(client1);
       order1.addPizza(pizza1);
       order1.addDrink(drink1);
       System.out.println(order1);


       Order order2 = new Order(2);
       Client client2 = new Client("Krysia","456123789", "Nadrzeczna 6/3");
       Pizza pizza2 = new Pizza(PizzaSize.small,PizzaType.Hawaii, 1);
       Pizza pizza3 = new Pizza(PizzaSize.medium,PizzaType.Capriciosa,1);
       Drinks drink2 = new Drinks(DrinksType.cola,1);

       order2.addClient(client2);
       order2.addPizza(pizza2);
       order2.addPizza(pizza3);
       order2.addDrink(drink2);
       System.out.println(order2);

        Order order3 = new Order(3);
        Client client3 = new Client ("Damian", "456123456","Polna12");
        Hamburger hamburger1= new Hamburger (HamburgerType.classic,HamburgerSize.medium,1);
        Drinks drinks3 = new Drinks(DrinksType.beer,1);

        order3.addClient(client3);
        order3.addHamburger(hamburger1);
        order3.addDrink(drinks3);
        System.out.println(order3);



        // pierwsze przymiarki
//        Order order1 = new Order();
//        order1.setOrderNumber(1);
//        order1.setName("Mirek");
//        order1.setAdress("Lakowa 2A");
//        order1.setTelephone(567567234);
//        order1.setQuantityPizza(1);
//        order1.setPizzaType(PizzaType.Peperoni);
//        order1.setPizzaSizze(PizzaSize.large);
//        order1.setQuantityDrinks(2);
//        order1.setDrinksType(DrinksType.juice);
//
//        Order order2 = new Order();
//        order2.setOrderNumber(2);
//        order2.setName("Krysia");
//        order2.setAdress("Nadrzeczna 6/3");
//        order2.setTelephone(565123465);
//        order2.setQuantityPizza(2);
//        order2.setPizzaType(PizzaType.Hawaii);
//        order2.setPizzaSizze(PizzaSize.small);
//        order2.setPizzaType(PizzaType.Capriciosa);
//        order2.setPizzaSizze(PizzaSize.medium);
//        order2.setQuantityDrinks(1);
//        order2.setDrinksType(DrinksType.cola);
//
//        Order order3 = new Order();
//
//        order3.setOrderNumber(3);
//        order3.setName("Damian");
//        order3.setAdress("Polna 13");
//        order3.setTelephone(234432234);
//        order3.setQuantityHamburger(1);
//        order3.setHamburgerType(HamburgerType.classic);
//        order3.setHamburgerSize(HamburgerSize.medium);
//        order3.setQuantityDrinks(1);
//        order3.setDrinksType(DrinksType.beer);
//





 //       System.out.println(order1.getPizzaType());




//        Client client1 = new Client();
//        client1.setName("Mirek");
//        client1.setAdress("Lakowa 2A");
//        client1.setTelephone(569521425);
//
//
//
//        Client client2 = new Client();
//        client2.setName("Krysia");
//        client2.setAdress("Nadrzeczna 6/3");
//        client2.setTelephone(532626323);
//
//        Client client3 = new Client();
//        client3.setName("Damian");
//        client3.setAdress("Polna 13");
//        client3.setTelephone(845948565);
//
//        Pizza pizza1 = new Pizza();
//        pizza1.setPizzaSizze(PizzaSize.large);
//        pizza1.setPizzaType(PizzaType.Peperoni);
//        pizza1.setQuantity(1);
//
//        Drinks drink1 = new Drinks();
//        drink1.setDrinksType(DrinksType.juice);
//        drink1.setQuantity(2);
//
//        Pizza pizza2 = new Pizza();
//        pizza2.setPizzaType(PizzaType.Hawaii);
//        pizza2.setPizzaSizze(PizzaSize.small);
//        pizza2.setQuantity(1);
//
//        Pizza pizza3 = new Pizza();
//        pizza3.setPizzaType(PizzaType.Capriciosa);
//        pizza3.setPizzaSizze(PizzaSize.medium);
//        pizza3.setQuantity(1);
//
//        Drinks drink2 = new Drinks();
//        drink2.setDrinksType(DrinksType.cola);
//        drink2.setQuantity(1);
//
//        Hamburger hamburger1 = new Hamburger();
//        hamburger1.setHamburgerType(HamburgerType.Classic);
//        hamburger1.setHamburgerSize(HamburgerSize.medium);
//        hamburger1.setQuantity(1);
//
//        Drinks drink3 = new Drinks();
//        drink3.setDrinksType(DrinksType.beer);
//        drink3.setQuantity(1);



//        Order order2 = new Order();
//        order2.setOrderNumber(2);
//        order2.setName("Krysia");
//        order2.setAdress("Nadrzeczna 6/3");
//        order2.setPizzaType(PizzaType.Hawaii);
//        order2.se





//        System.out.println(drink3.getDrinksType());
//
//
//
//        System.out.println(client1.getName());
//        System.out.println(client1.getAdress());
//        System.out.println(client1.getTelephone());
//
//        System.out.println(client2.getName());
//        System.out.println(client2.getAdress());
//        System.out.println(client2.getTelephone());
//
//        System.out.println(client3.getName());
//        System.out.println(client3.getAdress());
//        System.out.println(client3.getTelephone());

    }
}
