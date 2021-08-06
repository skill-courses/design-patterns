package structural_patterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Role implements Fight {
    private String name;

    @Override
    public void attack() {
        System.out.println("我是：" + this.name + "，我可以使用拳头发起攻击！");
    }
}
