public class Hamburger {
    private HamburgerType hamburgerType;
    private HamburgerSize hamburgerSize;
    private Integer quantityHamburger;


    public HamburgerType getHamburgerType() {
        return hamburgerType;
    }

    public void setHamburgerType(HamburgerType hamburgerType) {
        this.hamburgerType = hamburgerType;
    }

    public HamburgerSize getHamburgerSize() {
        return hamburgerSize;
    }

    public void setHamburgerSize(HamburgerSize hamburgerSize) {
        this.hamburgerSize = hamburgerSize;
    }

    public Integer getQuantityHamburger() {
        return quantityHamburger;
    }

    public void setQuantityHamburger(Integer quantityHamburger) {
        this.quantityHamburger = quantityHamburger;
    }

    public Hamburger(HamburgerType hamburgerType, HamburgerSize hamburgerSize, Integer quantityHamburger) {
        this.hamburgerType = hamburgerType;
        this.hamburgerSize = hamburgerSize;
        this.quantityHamburger = quantityHamburger;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "hamburgerType=" + hamburgerType +
                ", hamburgerSize=" + hamburgerSize +
                ", quantityHamburger=" + quantityHamburger +
                '}';
    }
}
