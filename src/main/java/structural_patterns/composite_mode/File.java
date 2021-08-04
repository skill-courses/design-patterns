package structural_patterns.composite_mode;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public abstract class File {
    protected String name;
    protected int size;
    protected LocalDateTime createTime;

    public abstract void display();
}
