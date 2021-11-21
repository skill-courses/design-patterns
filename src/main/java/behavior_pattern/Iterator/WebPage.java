package behavior_pattern.Iterator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class WebPage {
    private String content;
    private List<Link> links;
}
