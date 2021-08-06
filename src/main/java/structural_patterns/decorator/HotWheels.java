package structural_patterns.decorator;

public class HotWheels extends WeaponDecorator{
    public HotWheels(Fight fight) {
        super(fight);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("但是现在，我可以脚踩风火轮发起攻击！");
    }
}
