package behavior_pattern.template;

public class Coffee extends BrewedDrink{
    @Override
    protected void brew() {
        System.out.println("将磨好的咖啡倒入沸水中，搅拌片刻......");
    }

    @Override
    protected void addCondiments() {
        System.out.println("添加一点牛奶和白糖，更加美味......");
    }
}
