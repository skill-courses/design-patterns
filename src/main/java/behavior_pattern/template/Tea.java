package behavior_pattern.template;

public class Tea extends BrewedDrink{
    @Override
    protected void brew() {
        System.out.println("将上等茶叶放入沸水中冲泡，稍等片刻......");
    }

    @Override
    protected void addCondiments() {
        System.out.println("给泡好的茶水里面加点糖......");
    }
}
