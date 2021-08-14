package structural_patterns.composite_mode;

import basic.BasicTest;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FolderTest extends BasicTest {
    @Test
    void shouldDisplayAllFiles() {
        LocalDateTime now = LocalDateTime.of(2021, 8, 3, 12, 13);
        Folder rootFolder = new Folder("根文件夹", 300, now);

        TextFile text1 = new TextFile("年终总结", 20, now.minusHours(1));
        ImageFile img1 = new ImageFile("个人靓照", 10, now.minusHours(10));
        rootFolder.addFile(text1);
        rootFolder.addFile(img1);

        Folder subFolder = new Folder("子文件夹", 40, now);
        VideoFile video = new VideoFile("恭贺新年视频", 60, now);
        TextFile text2 = new TextFile("Interview ++", 20, now.minusHours(1));
        subFolder.addFile(video);
        subFolder.addFile(text2);
        rootFolder.addFile(subFolder);

        rootFolder.display();

        assertEquals("""
                这里是文本文件，文件名为：年终总结，文件大小为：20，创建时间为2021-08-03T11:13
                这里是图片文件，文件名为：个人靓照，文件大小为：10，创建时间为2021-08-03T02:13
                这里是视频文件，文件名为：恭贺新年视频，文件大小为：60，创建时间为2021-08-03T12:13
                这里是文本文件，文件名为：Interview ++，文件大小为：20，创建时间为2021-08-03T11:13""", outputStreamCaptor.toString().trim());
    }
}