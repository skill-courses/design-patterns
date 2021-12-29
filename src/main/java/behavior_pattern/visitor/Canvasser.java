package behavior_pattern.visitor;

public class Canvasser implements Visitor{
    @Override
    public void visite(Community community) {
        System.out.println("您好，请问您需要医疗保险么？");
    }

    @Override
    public void visite(Bank bank) {
        System.out.println("您好，请问您需要失窃保险么？");
    }

    @Override
    public void visite(Cafe cafe) {
        System.out.println("您好，请问您需要火灾和洪水保险么？");
    }
}
