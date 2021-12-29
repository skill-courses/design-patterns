package behavior_pattern.visitor;

public class Community implements Architecture{
    public Community() {
        System.out.println("欢迎来到花园小区！");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visiteCommunity(this);
    }
}
