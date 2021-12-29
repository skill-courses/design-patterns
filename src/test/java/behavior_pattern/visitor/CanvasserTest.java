package behavior_pattern.visitor;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanvasserTest extends BasicTest {

    @Test
    public void should_can_selling_health_insurance() {
        Community community = new Community();
        Visitor visitor = new Canvasser();
        visitor.visite(community);

        assertEquals("""
                欢迎来到花园小区！
                您好，请问您需要医疗保险么？""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_selling_theft_protection() {
        Bank bank = new Bank();
        Visitor visitor = new Canvasser();
        visitor.visite(bank);

        assertEquals("""
                欢迎来到银行！
                您好，请问您需要失窃保险么？""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_selling_fire_insurance() {
        Cafe cafe = new Cafe();
        Visitor visitor = new Canvasser();
        visitor.visite(cafe);

        assertEquals("""
                欢迎来到咖啡厅！
                您好，请问您需要火灾和洪水保险么？""", outputStreamCaptor.toString().trim());
    }

}