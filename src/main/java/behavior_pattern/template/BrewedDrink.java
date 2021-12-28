package behavior_pattern.template;

public abstract class BrewedDrink {
    public void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("水已经烧开了，准备冲泡......");
    }

    private void pourInCup() {
        System.out.println("冲泡成功，倒入杯子");
    }
}
