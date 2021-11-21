package behavior_pattern.Iterator;

import java.util.*;

public class BFSCrawler implements Crawler {
    private final List<String> contents = new ArrayList<>();
    private final Queue<WebPage> queue = new ArrayDeque<>();

    @Override
    public void addRoot(WebPage webPage) {
        queue.offer(webPage);
    }

    @Override
    public void remove(WebPage webPage) {
        queue.remove(webPage);
    }

    @Override
    public Iterator iterator() {
        bfsTraverse();
        return contents.iterator();
    }

    private void bfsTraverse() {
        while (!queue.isEmpty()) {
            WebPage webPage = queue.poll();
            contents.add(webPage.getContent());
            if (webPage.getLinks() != null && !webPage.getLinks().isEmpty()) {
                webPage.getLinks().forEach(it -> queue.offer(it.getWebPage()));
            }
        }
    }
}
