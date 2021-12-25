package behavior_pattern.observer;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficialAccountTest extends BasicTest {

    @Test
    public void should_can_recevice_message_when_add_2_subscriber() {
        Article article = Article.builder().title("JVM垃圾回收机制").build();
        OfficialAccount officialAccount = new OfficialAccount();
        officialAccount.addSubscriber(WechatSubscriber.builder().name("张三").build());
        officialAccount.addSubscriber(WechatSubscriber.builder().name("李四").build());
        officialAccount.addArticle(article);

        assertEquals("""
                张三已经收到订阅消息: 最新文章《JVM垃圾回收机制》已经发布，请速来围观！
                李四已经收到订阅消息: 最新文章《JVM垃圾回收机制》已经发布，请速来围观！""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_recevice_message_when_remove_1_subscriber() {
        Article article = Article.builder().title("JVM垃圾回收机制").build();
        OfficialAccount officialAccount = new OfficialAccount();
        WechatSubscriber zhangsan = WechatSubscriber.builder().name("张三").build();
        officialAccount.addSubscriber(zhangsan);
        officialAccount.addSubscriber(WechatSubscriber.builder().name("李四").build());
        officialAccount.removeSubscriber(zhangsan);
        officialAccount.addArticle(article);

        assertEquals("""
                李四已经收到订阅消息: 最新文章《JVM垃圾回收机制》已经发布，请速来围观！""", outputStreamCaptor.toString().trim());
    }
}