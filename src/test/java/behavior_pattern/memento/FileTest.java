package behavior_pattern.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {

    @Test
    public void should_generate_file_version_after_commit() {
        VersionController versionController = new VersionController();
        File file = new File("你好，张三！");
        int version1 = versionController.commit(file);
        file.write("你好，李四");
        int version2 = versionController.commit(file);
        assertEquals(1, version1);
        assertEquals(2, version2);
    }

    @Test
    public void should_reset_file_after_commit() {
        VersionController versionController = new VersionController();
        File file = new File("你好，张三！");
        versionController.commit(file);
        file.write("你好，李四");
        versionController.commit(file);

        assertEquals("你好，张三！你好，李四", file.read());
        File lastFile = versionController.reset();
        assertEquals("你好，张三！", lastFile.read());
    }
}