package structural_patterns.facade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {
    private String name;
    private int money;
    private House house;

    public People(String name, int money, House house) {
        this.name = name;
        this.money = money;
        this.house = house;
    }

    public void income(int money) {
        this.money += money;
    }

    public void expense(int money) {
        this.money -= money;
    }
}
