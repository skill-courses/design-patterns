package behavior_pattern.state;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairDryerTest extends BasicTest {
    @Test
    public void should_can_turn_on_hot_off_model() {
        HairDryer hairDryer = new HairDryer();
        hairDryer.switchMode();
        hairDryer.turnOnOrOff();
        hairDryer.turnOnOrOff();
        assertEquals("""
                吹风机在关闭的状态下无法切换模式!
                状态切换: 关闭状态 => 开机热风状态
                状态切换: 开机热风状态 => 关闭状态""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_turn_on_hot_hotcold_cold_off_model() {
        HairDryer hairDryer = new HairDryer();
        hairDryer.turnOnOrOff();
        hairDryer.switchMode();
        hairDryer.switchMode();
        hairDryer.switchMode();
        hairDryer.turnOnOrOff();
        assertEquals("""
                状态切换: 关闭状态 => 开机热风状态
                状态切换: 开机热风状态 => 开机冷热风交替状态
                状态切换: 开机冷热风交替状态 => 开机冷风状态
                状态切换: 开机冷风状态 => 开机热风状态
                状态切换: 开机热风状态 => 关闭状态""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_turn_on_hot_hotcold_off_model() {
        HairDryer hairDryer = new HairDryer();
        hairDryer.turnOnOrOff();
        hairDryer.switchMode();
        hairDryer.turnOnOrOff();
        assertEquals("""
                状态切换: 关闭状态 => 开机热风状态
                状态切换: 开机热风状态 => 开机冷热风交替状态
                状态切换: 开机冷热风交替状态 => 关闭状态""", outputStreamCaptor.toString().trim());
    }

}