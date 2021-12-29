package behavior_pattern.visitor;

public class Bank implements Architecture{
    public Bank() {
        System.out.println("欢迎来到银行！");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visiteBank(this);
    }
}
