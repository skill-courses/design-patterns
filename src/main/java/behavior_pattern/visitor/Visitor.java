package behavior_pattern.visitor;

public interface Visitor {
    void visite(Community community);
    void visite(Bank bank);
    void visite(Cafe cafe);
}
