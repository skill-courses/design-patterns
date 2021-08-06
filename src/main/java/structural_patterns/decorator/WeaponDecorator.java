package structural_patterns.decorator;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class WeaponDecorator implements Fight{
    protected Fight fight;

    public WeaponDecorator(Fight fight) {
        this.fight = fight;
    }

    @Override
    public void attack() {
        fight.attack();
    }
}
