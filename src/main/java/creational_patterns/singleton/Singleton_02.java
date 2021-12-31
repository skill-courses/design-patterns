package creational_patterns.singleton;

//􏸕懒汉模式(线程安全)
public class Singleton_02 {
    private static Singleton_02 singleton;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance() {
        if (null != singleton) {
            return singleton;
        }

        singleton = new Singleton_02();
        return singleton;
    }
}
