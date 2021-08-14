package structural_patterns.decorator;

import basic.BasicTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoleTest extends BasicTest {
    @Test
    void should_can_attack() {
        Role neZha = new Role("哪吒");
        RedTasseledGun redTasseledGun = new RedTasseledGun(neZha);
        HotWheels hotWheels = new HotWheels(redTasseledGun);
        MixeDayTwill mixeDayTwill = new MixeDayTwill(hotWheels);

        mixeDayTwill.attack();

        assertEquals("""
                我是：哪吒，我可以使用拳头发起攻击！
                但是现在，我可以手持红缨枪发起攻击！
                但是现在，我可以脚踩风火轮发起攻击！
                但是现在，我可以身披混天绫发起攻击！""", outputStreamCaptor.toString().trim());
    }
}