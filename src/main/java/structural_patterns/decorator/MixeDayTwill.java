package structural_patterns.decorator;

public class MixeDayTwill extends WeaponDecorator{
    public MixeDayTwill(Fight fight) {
        super(fight);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("但是现在，我可以身披混天绫发起攻击！");
    }
}
