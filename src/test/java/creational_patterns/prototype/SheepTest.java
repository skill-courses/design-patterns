package creational_patterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SheepTest {
    @Test
    public void should_could_clone_self() throws CloneNotSupportedException {
        Sheep sheep = new Sheep("白色", "多利", 67.9);
        Sheep cloneSheep = (Sheep) sheep.clone();

        assertEquals(sheep.getColor(), cloneSheep.getColor());
        assertEquals(sheep.getName(), cloneSheep.getName());
        assertEquals(sheep.getWeight(), cloneSheep.getWeight());
    }

}