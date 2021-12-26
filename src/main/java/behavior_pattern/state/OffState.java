package behavior_pattern.state;

public class OffState implements State{

    @Override
    public void turnOnOrOff(HairDryer hairDryer) {
        hairDryer.setState(new HotAirState());
        System.out.println("状态切换: 关闭状态 => 开机热风状态");
    }

    @Override
    public void switchMode(HairDryer hairDryer) {
        System.out.println("吹风机在关闭的状态下无法切换模式!");
    }
}
