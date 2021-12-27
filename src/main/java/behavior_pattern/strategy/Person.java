package behavior_pattern.strategy;

public class Person {
    private Context context;
    private String name;
    private int money;

    public Person(String name, int money) {
        this.context = new Context();
        this.name = name;
        this.money = money;
    }

    public void fromWuhanToBeiJing() {
        context.goToBeiJing(this.money);
    }
}
