package creational_patterns.singleton;

//饿汉模式(线程安全)
public class Singleton_03 {
    private static final Singleton_03 instance = new Singleton_03();

    private Singleton_03() {

    }

    public static Singleton_03 getInstance() {
        return instance;
    }
}
