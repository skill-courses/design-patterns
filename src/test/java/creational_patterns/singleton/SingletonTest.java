package creational_patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void should_can_create_singleton_01() {
        Singleton_01 instance = Singleton_01.getInstance();
        Singleton_01 instance1 = Singleton_01.getInstance();

        Assertions.assertEquals(instance, instance1);
    }

    @Test
    public void should_can_create_singleton_02() {
        Singleton_02 instance = Singleton_02.getInstance();
        Singleton_02 instance1 = Singleton_02.getInstance();

        Assertions.assertEquals(instance, instance1);
    }

    @Test
    public void should_can_create_singleton_03() {
        Singleton_03 instance = Singleton_03.getInstance();
        Singleton_03 instance1 = Singleton_03.getInstance();

        Assertions.assertEquals(instance, instance1);
    }

    @Test
    public void should_can_create_singleton_04() {
        Singleton_04 instance = Singleton_04.getInstance();
        Singleton_04 instance1 = Singleton_04.getInstance();

        Assertions.assertEquals(instance, instance1);
    }

    @Test
    public void should_can_create_singleton_05() {
        Singleton_05 instance = Singleton_05.getInstance();
        Singleton_05 instance1 = Singleton_05.getInstance();

        Assertions.assertEquals(instance, instance1);
    }

}