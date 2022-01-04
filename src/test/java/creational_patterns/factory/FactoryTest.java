package creational_patterns.factory;

import basic.BasicTest;
import creational_patterns.factory.factory.Factory;
import creational_patterns.factory.factory.PhoneFactory;
import creational_patterns.factory.factory.TabletFactory;
import creational_patterns.factory.simple_factory.Product;
import creational_patterns.factory.simple_factory.SimpleFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest extends BasicTest {

    @Test
    public void should_can_produce_phone_for_simple_factory() {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.produceProduct("华为手机P50");
        product.produce();
        assertEquals("手机：华为手机P50已经生产完成！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_produce_tablet_for_simple_factory() {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.produceProduct("华为平板Matepad10.4");
        product.produce();
        assertEquals("平板：华为平板Matepad10.4已经生产完成！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_produce_phone_for_factory() {
        Factory factory = new PhoneFactory();
        Product product = factory.produceProduct("华为手机P50");
        product.produce();
        assertEquals("手机：华为手机P50已经生产完成！", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_produce_tablet_for_factory() {
        Factory factory = new TabletFactory();
        Product product = factory.produceProduct("华为平板Matepad10.4");
        product.produce();
        assertEquals("平板：华为平板Matepad10.4已经生产完成！", outputStreamCaptor.toString().trim());
    }

}