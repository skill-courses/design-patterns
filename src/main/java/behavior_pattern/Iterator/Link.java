package behavior_pattern.Iterator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Link {
    private String url;
    private WebPage webPage;
}
