package structural_patterns.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CoachTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    public void the_coach_should_can_deliver_tactics_for_yao_ming() {
        Player mcGrady = new Player("麦迪");
        Player battier = new Player("巴蒂尔");
        ForeignCenter yaoMing = new ForeignCenter("姚明");
        Translator translator = new Translator(yaoMing);

        Coach mcHale = Coach.builder().name("麦克海尔").build();
        mcHale.deliverTactics(Arrays.asList(mcGrady, battier, translator));

        assertEquals("""
                麦迪 defense successfully!
                麦迪 start attack!
                巴蒂尔 defense successfully!
                巴蒂尔 start attack!
                姚明防守成功！
                姚明开始进攻！""", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}