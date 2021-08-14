package structural_patterns.adapter;

import basic.BasicTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class CoachTest extends BasicTest {
    @Test
    public void the_coach_should_can_deliver_tactics_for_yao_ming() {
        Player mcGrady = new Player("麦迪");
        Player battier = new Player("巴蒂尔");
        ForeignCenter yaoMing = new ForeignCenter("姚明");
        Translator translator = new Translator(yaoMing);

        Coach mcHale = Coach.builder().name("范甘迪").build();
        mcHale.deliverTactics(Arrays.asList(mcGrady, battier, translator));

        assertEquals("""
                范甘迪 deliver the tactics for players!
                麦迪 defense successfully!
                麦迪 start attack!
                巴蒂尔 defense successfully!
                巴蒂尔 start attack!
                姚明防守成功！
                姚明开始进攻！""", outputStreamCaptor.toString().trim());
    }
}