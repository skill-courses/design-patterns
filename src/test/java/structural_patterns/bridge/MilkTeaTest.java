package structural_patterns.bridge;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilkTeaTest extends BasicTest {

    @Test
    void should_order_two_big_cup_heating_milk_tea() {
        MilkTea tea = new BigCup(new Heat());
        tea.order(2);

        assertEquals("已经为您订购2大杯加热奶茶！", outputStreamCaptor.toString().trim());
    }

    @Test
    void should_order_one_small_cup_on_the_rocks_milk_tea() {
        MilkTea tea = new SmallCup(new Rocks());
        tea.order(1);

        assertEquals("已经为您订购1小杯加冰奶茶！", outputStreamCaptor.toString().trim());
    }

    @Test
    void should_order_three_middle_cup_normal_milk_tea() {
        MilkTea tea = new MiddleCup(new Temperature() {
        });
        tea.order(3);

        assertEquals("已经为您订购3中杯常温奶茶！", outputStreamCaptor.toString().trim());
    }
}