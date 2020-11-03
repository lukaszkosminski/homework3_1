import java.util.LinkedList;
import java.util.List;

public class Order   {

    private List<Pizza> pizza=new LinkedList<>();
    private List<Hamburger> hamburger = new LinkedList<>();
    private List<Drinks> drink = new LinkedList<>();
    private List<Client> client = new LinkedList<>();

    public void addPizza(Pizza pizza){
        this.pizza.add(pizza);
    }
    public void addHamburger(Hamburger hamburger){
        this.hamburger.add(hamburger);

    }
    public void addDrink(Drinks drink){
        this.drink.add(drink);

    }
    public void addClient(Client client){
        this.client.add(client);
    }

    private Integer orderNumber;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order(Integer orderNumber) {

        this.orderNumber = orderNumber;
    }


    @Override
    public String toString() {
        return "Order{" +
                "pizza=" + pizza +
                ", hamburger=" + hamburger +
                ", drink=" + drink +
                ", orderNumber=" + orderNumber +
                '}';
    }
}
