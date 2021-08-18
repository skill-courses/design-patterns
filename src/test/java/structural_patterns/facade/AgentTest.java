package structural_patterns.facade;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgentTest extends BasicTest {

    @Test
    void housingTrading() {
        Buyer buyer = new Buyer("张三", 50, null, 0);
        Seller seller = new Seller("李四", 20, null);
        House house = House.builder().location("武汉").owner(seller).size(130).price(100).build();
        seller.setHouse(house);
        Agent agent = new Agent();
        agent.housingTrading(buyer, seller);

        assertEquals("""
                房管局就房屋买卖合同办理备案！
                房管局已为张三办理过户！
                李四已经收到张三支付的首付款30万元！
                张三已经贷款70万元，银行已经放款给：李四""", outputStreamCaptor.toString().trim());
        assertEquals(20, buyer.getMoney());
        assertEquals(70, buyer.getLoan());
        assertNotNull(buyer.getHouse());
        assertEquals(120, seller.getMoney());
        assertNull(seller.getHouse());
    }
}