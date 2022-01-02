package creational_patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    public void should_can_build_lenovo_computer() {
        ComputerBuilder lenovoComputerBuild = new LenovoBuilder();
        Director director = new Director(lenovoComputerBuild);
        Computer lenovoComputer = director.buildComputer();
        String result = lenovoComputer.toString();

        assertEquals("PC:Lenovo CPU, Lenovo 500G memory, Lenovo 2048k * 1680k monitor, Lenovo keyboard", result);
    }

    @Test
    public void should_can_build_mac_computer() {
        ComputerBuilder macComputerBuilder = new MacBuilder();
        Director director = new Director(macComputerBuilder);
        Computer macComputer = director.buildComputer();
        String result = macComputer.toString();

        assertEquals("PC:MAC cpu, Apple 512G memory, Apple 4000k * 2048k monitor, Mac wireless keyboard", result);
    }

}