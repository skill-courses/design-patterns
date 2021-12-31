package creational_patterns.singleton;

// 枚举实现单利(线程安全)
public class Singleton_05 {
    private Singleton_05() {}

    private enum Singleton {
        INSTANCE;

        private final Singleton_05 instance;

        Singleton() {
            instance = new Singleton_05();
        }

        private Singleton_05 getInstance() {
            return instance;
        }
    }

    public static Singleton_05 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
