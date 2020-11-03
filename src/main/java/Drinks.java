public class Drinks{

    private DrinksType drinksType;
    private Integer quantityDrinks;

    public DrinksType getDrinksType() {
        return drinksType;
    }

    public void setDrinksType(DrinksType drinksType) {
        this.drinksType = drinksType;
    }

    public Integer getQuantityDrinks() {
        return quantityDrinks;
    }

    public void setQuantityDrinks(Integer quantityDrinks) {
        this.quantityDrinks = quantityDrinks;
    }

    Drinks(DrinksType drinksType, Integer quantityDrinks) {

        this.drinksType = drinksType;
        this.quantityDrinks = quantityDrinks;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinksType=" + drinksType +
                ", quantityDrinks=" + quantityDrinks +
                '}';
    }
}
