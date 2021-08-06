package structural_patterns.decorator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

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

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}