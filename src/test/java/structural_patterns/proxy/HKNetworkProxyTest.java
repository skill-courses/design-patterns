package structural_patterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HKNetworkProxyTest {

    @Test
    void should_can_visit_yutube() {
        HKNetworkProxy proxy = new HKNetworkProxy();
        String data = proxy.querying("https://www.youtube.com/");

        assertEquals("欢迎来到YuTuBe, 这里有海量的视频供你随心观看哦！", data);
    }

    @Test
    void should_can_not_visit_facebook() {
        HKNetworkProxy proxy = new HKNetworkProxy();
        String data = proxy.querying("https://www.facebook.com/");

        assertEquals("不能访问违禁网站！", data);
    }
}