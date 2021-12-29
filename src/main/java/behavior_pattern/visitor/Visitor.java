package behavior_pattern.visitor;

public interface Visitor {
    void visiteCommunity(Community community);
    void visiteBank(Bank bank);
    void visiteCafe(Cafe cafe);
}
