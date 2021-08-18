package structural_patterns.facade;

public class HousingAuthority {
    public void recordContract(Contract contract) {
        System.out.println("房管局就" + contract.getName() + "办理备案！");
        contract.setIsRecorded(true);
    }

    public void transferHouse(Buyer buyer, Seller seller) {
        House house = seller.getHouse();
        buyer.setHouse(house);
        house.setOwner(buyer);
        seller.setHouse(null);
        System.out.println("房管局已为" + buyer.getName() + "办理过户！");
        int moneny = (int) (house.getPrice() * 0.3);
        seller.income(moneny);
        buyer.expense(moneny);
        System.out.println(seller.getName() + "已经收到" + buyer.getName() + "支付的首付款" + moneny + "万元！");
    }
}
