package creational_patterns.singleton;

//懒汉模式(线程不安全)
public class Singleton_01 {
    private static Singleton_01 singleton;

    private Singleton_01() {

    }

    public static Singleton_01 getInstance() {
        if (null != singleton) {
            return singleton;
        }
        singleton = new Singleton_01();
        return singleton;
    }
}
