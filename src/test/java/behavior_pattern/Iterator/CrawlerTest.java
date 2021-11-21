package behavior_pattern.Iterator;

import basic.BasicTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrawlerTest extends BasicTest {
    private static WebPage root;
    private Crawler crawler;

    @BeforeAll
    public static void init() {
        WebPage webPage11 = WebPage.builder().content("webpage11").build();
        Link link11 = Link.builder().url("url11").webPage(webPage11).build();
        WebPage webPage1 = WebPage.builder().content("webpage1").links(Collections.singletonList(link11)).build();
        Link link1 = Link.builder().url("url1").webPage(webPage1).build();

        WebPage webPage21 = WebPage.builder().content("webpage21").build();
        Link link21 = Link.builder().url("url21").webPage(webPage21).build();
        WebPage webPage22 = WebPage.builder().content("webpage22").build();
        Link link22 = Link.builder().url("url21").webPage(webPage22).build();
        WebPage webPage2 = WebPage.builder().content("webpage2").links(Arrays.asList(link21, link22)).build();
        Link link2 = Link.builder().url("url2").webPage(webPage2).build();
        root = WebPage.builder().content("Root").links(Arrays.asList(link1, link2)).build();
    }

    @Test
    public void should_can_crawler_webpage_by_dfs() {
        crawler = new DFSCrawler();
        crawler.addRoot(root);
        Iterator iterator = crawler.iterator();
        while (iterator.hasNext()) {
            String content = (String) iterator.next();
            System.out.println(content);
        }

        assertEquals("""
               Root
               webpage2
               webpage22
               webpage21
               webpage1
               webpage11""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_crawler_webpage_by_bfs() {
        crawler = new BFSCrawler();
        crawler.addRoot(root);
        Iterator iterator = crawler.iterator();
        while (iterator.hasNext()) {
            String content = (String) iterator.next();
            System.out.println(content);
        }

        assertEquals("""
              Root
              webpage1
              webpage2
              webpage11
              webpage21
              webpage22""", outputStreamCaptor.toString().trim());
    }
}