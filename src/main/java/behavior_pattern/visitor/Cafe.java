package behavior_pattern.visitor;

public class Cafe implements Architecture{
    public Cafe() {
        System.out.println("欢迎来到咖啡厅！");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }
}
