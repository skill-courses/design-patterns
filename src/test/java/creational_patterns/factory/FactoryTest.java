package creational_patterns.factory;

import basic.BasicTest;
import creational_patterns.factory.abstract_factory.*;
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

    @Test
    public void huawei_factory_should_can_produce_phone_or_tablet() {
        ProductFactory factory = new HuaweiFactory();
        Phone phone = factory.producePhone();
        Tablet tablet = factory.produceTablet();
        phone.producePhone();
        tablet.produceTablet();
        assertEquals("""
                生产华为手机：P50
                生产华为平板：Matepad10.4""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void apple_factory_should_can_produce_phone_or_tablet() {
        ProductFactory factory = new AppleFactory();
        Phone phone = factory.producePhone();
        Tablet tablet = factory.produceTablet();
        phone.producePhone();
        tablet.produceTablet();
        assertEquals("""
                生产苹果手机：Iphone13
                生产苹果平板：Ipad4""", outputStreamCaptor.toString().trim());
    }

}