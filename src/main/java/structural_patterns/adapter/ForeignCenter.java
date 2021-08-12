package structural_patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ForeignCenter {
    private final String name;

    public void jinGong() {
        System.out.println(this.name + "开始进攻！");
    }

    public void fangShou() {
        System.out.println(this.name + "防守成功！");
    }
}
