package behavior_pattern.state;

public class HotAirState implements State{

    @Override
    public void turnOnOrOff(HairDryer hairDryer) {
        hairDryer.setState(new OffState());
        System.out.println("状态切换: 开机热风状态 => 关闭状态");
    }

    @Override
    public void switchMode(HairDryer hairDryer) {
        hairDryer.setState(new AlternateHotAndColdAirState());
        System.out.println("状态切换: 开机热风状态 => 开机冷热风交替状态");
    }
}
