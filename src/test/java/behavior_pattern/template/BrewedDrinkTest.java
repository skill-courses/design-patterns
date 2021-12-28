package behavior_pattern.template;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrewedDrinkTest extends BasicTest {

    @Test
    public void should_can_prepare_tea() {
        BrewedDrink brewedDrink = new Tea();
        brewedDrink.prepareDrink();

        assertEquals("""
                水已经烧开了，准备冲泡......
                将上等茶叶放入沸水中冲泡，稍等片刻......
                冲泡成功，倒入杯子
                给泡好的茶水里面加点糖......""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_prepare_coffee() {
        BrewedDrink brewedDrink = new Coffee();
        brewedDrink.prepareDrink();

        assertEquals("""
                水已经烧开了，准备冲泡......
                将磨好的咖啡倒入沸水中，搅拌片刻......
                冲泡成功，倒入杯子
                添加一点牛奶和白糖，更加美味......""", outputStreamCaptor.toString().trim());
    }

}