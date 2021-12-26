package behavior_pattern.state;

public interface State {
    void turnOnOrOff(HairDryer hairDryer);

    void switchMode(HairDryer hairDryer);
}
