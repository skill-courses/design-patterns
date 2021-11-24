package behavior_pattern.mediator;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseAgentTest extends BasicTest {

    @Test
    public void seller_can_send_message_to_buyers() {
        Medium medium = new HouseAgent();
        Customer zhangsan = new Seller("张三");
        Customer lisi = new Buyer("李四");
        Customer wangwu = new Buyer("王五");
        medium.register(zhangsan);
        medium.register(lisi);
        medium.register(wangwu);

        zhangsan.send("有一套两室一厅出售，欲购从速！");

        assertEquals("""
                买方李四收到张三的消息：有一套两室一厅出售，欲购从速！
                买方王五收到张三的消息：有一套两室一厅出售，欲购从速！""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void buyer_can_send_message_to_sellers() {
        Medium medium = new HouseAgent();
        Customer zhangsan = new Seller("张三");
        Customer lisi = new Seller("李四");
        Customer wangwu = new Buyer("王五");
        medium.register(zhangsan);
        medium.register(lisi);
        medium.register(wangwu);

        wangwu.send("想购买一套三居室的房子！");

        assertEquals("""
                卖方张三收到王五的消息：想购买一套三居室的房子！
                卖方李四收到王五的消息：想购买一套三居室的房子！""", outputStreamCaptor.toString().trim());
    }

}