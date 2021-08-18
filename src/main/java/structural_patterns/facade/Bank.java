package structural_patterns.facade;

public class Bank {
    public void makeLoan(Contract contract) {
        Buyer buyer = contract.getBuyer();
        Seller seller = contract.getSeller();
        int loan = (int) (contract.getHouse().getPrice() *  0.7);
        buyer.setLoan(loan);
        seller.income(loan);
        System.out.println(buyer.getName() + "已经贷款" + loan + "万元，" + "银行已经放款给：" + seller.getName());
    }
}
