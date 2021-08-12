package structural_patterns.adapter;

public class Player implements Tactics{
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(this.name + " start attack!");
    }

    @Override
    public void defense() {
        System.out.println(this.name + " defense successfully!");
    }
}
