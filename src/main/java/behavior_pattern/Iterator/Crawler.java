package behavior_pattern.Iterator;

import java.util.Iterator;

public interface Crawler {
    void addRoot(WebPage webPage);

    void remove(WebPage webPage);

    Iterator iterator();
}
