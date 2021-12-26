package behavior_pattern.state;

public class HairDryer {
    private State state;

    public HairDryer() {
        this.state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOnOrOff() {
        this.state.turnOnOrOff(this);
    }

    public void switchMode() {
        this.state.switchMode(this);
    }
}
