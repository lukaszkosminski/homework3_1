import java.util.Objects;

public class Pizza {

    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private Integer quantityPizza;


    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Integer getQuantityPizza() {
        return quantityPizza;
    }

    public void setQuantityPizza(Integer quantityPizza) {
        this.quantityPizza = quantityPizza;
    }

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, Integer quantityPizza) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantityPizza = quantityPizza;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", pizzaType=" + pizzaType +
                ", quantityPizza=" + quantityPizza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pizzaSize == pizza.pizzaSize &&
                pizzaType == pizza.pizzaType &&
                quantityPizza.equals(pizza.quantityPizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaSize, pizzaType, quantityPizza);
    }
}


