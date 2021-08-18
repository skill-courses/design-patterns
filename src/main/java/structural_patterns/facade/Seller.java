package structural_patterns.facade;

public class Seller extends People{
    public Seller(String name, int money, House house) {
        super(name, money, house);
    }

    public int sellHouse() {
        return this.getHouse().getPrice();
    }
}
