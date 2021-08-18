package structural_patterns.facade;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Buyer extends People {
    private int loan;

    public Buyer(String name, int money, House house, int loan) {
        super(name, money, house);
        this.loan = loan;
    }

    public void buyHouse() {
        this.setHouse(House.builder().build());
    }
}
