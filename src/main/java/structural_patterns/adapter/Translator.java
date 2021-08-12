package structural_patterns.adapter;

public class Translator extends Player{

    private final ForeignCenter foreignCenter;

    public Translator(ForeignCenter foreignCenter) {
        super(foreignCenter.getName());
        this.foreignCenter = foreignCenter;
    }

    @Override
    public void attack() {
        this.foreignCenter.jinGong();
    }

    @Override
    public void defense() {
        this.foreignCenter.fangShou();
    }
}
