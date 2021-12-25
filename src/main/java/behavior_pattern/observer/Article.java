package behavior_pattern.observer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
public class Article {
    private String title;
    private String context;
}
