package behavior_pattern.strategy;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest extends BasicTest {

    @Test
    public void should_go_to_beijing_by_airplane() {
        Person person = new Person("张三", 10000);
        person.fromWuhanToBeiJing();

        assertEquals("乘坐飞机到达北京！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_go_to_beijing_by_train() {
        Person person = new Person("张三", 3000);
        person.fromWuhanToBeiJing();

        assertEquals("乘坐火车去北京！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_go_to_beijing_by_bus() {
        Person person = new Person("张三", 1500);
        person.fromWuhanToBeiJing();

        assertEquals("乘坐大巴车去北京！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_go_to_beijing_by_cycling() {
        Person person = new Person("张三", 800);
        person.fromWuhanToBeiJing();

        assertEquals("骑行去北京！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_not_go_to_beijing() {
        Person person = new Person("张三", 200);
        person.fromWuhanToBeiJing();

        assertEquals("这点钱还是不出去潇洒了吧，好好呆着！", outputStreamCaptor.toString().trim());
    }

}