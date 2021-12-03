package behavior_pattern.memento;

public class File {
    private String content;

    public File(String content) {
        this.content = content;
    }

    public void write(String str) {
        content += str;
    }

    public String read() {
        return this.content;
    }
}
