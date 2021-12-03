package behavior_pattern.memento;

public class FileSnapshot {
    private final int version;
    private final String content;

    public FileSnapshot(int version, File file) {
        this.version = version;
        this.content = file.read();
    }

    public File getFile() {
        return new File(content);
    }

    public int getVersion() {
        return version;
    }
}
