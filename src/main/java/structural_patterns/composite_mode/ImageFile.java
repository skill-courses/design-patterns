package structural_patterns.composite_mode;

import java.time.LocalDateTime;

public class ImageFile extends File{
    ImageFile(String name, int size, LocalDateTime createTime) {
        super(name, size, createTime);
    }

    @Override
    public void display() {
        System.out.println("这里是图片文件，文件名为：" + this.name + "，文件大小为：" + this.size + "，创建时间为" + this.createTime);
    }
}
