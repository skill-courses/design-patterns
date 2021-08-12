package structural_patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Builder
public class Coach{
    private String name;

    public void deliverTactics(List<Player> players) {
        players.forEach(it -> {
            it.defense();
            it.attack();
        });
    }
}
