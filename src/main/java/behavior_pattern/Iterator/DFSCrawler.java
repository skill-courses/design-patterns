package behavior_pattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DFSCrawler implements Crawler {
    private final Stack<WebPage> stack = new Stack<>();
    private final List<String> contents = new ArrayList<>();

    @Override
    public void addRoot(WebPage webPage) {
        stack.add(webPage);
    }

    @Override
    public void remove(WebPage webPage) {
        stack.remove(webPage);
    }

    @Override
    public Iterator iterator() {
        dfsTraverse();
        return contents.iterator();
    }

    private void dfsTraverse() {
        while (!stack.isEmpty()) {
            WebPage webPage = stack.pop();
            contents.add(webPage.getContent());
            if (webPage.getLinks() != null && !webPage.getLinks().isEmpty()) {
                webPage.getLinks().forEach(it -> stack.push(it.getWebPage()));
            }
        }
    }
}
