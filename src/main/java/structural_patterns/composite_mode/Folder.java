package structural_patterns.composite_mode;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private final List<File> files;

    Folder(String name, int size, LocalDateTime createTime) {
        super(name, size, createTime);
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    @Override
    public void display() {
        this.files.forEach(File::display);
    }
}
