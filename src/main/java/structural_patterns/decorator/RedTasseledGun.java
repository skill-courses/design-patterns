package structural_patterns.decorator;


public class RedTasseledGun extends WeaponDecorator{

    public RedTasseledGun(Fight fight) {
        super(fight);
   }

    @Override
    public void attack() {
        super.attack();
        System.out.println("但是现在，我可以手持红缨枪发起攻击！");
    }
}
