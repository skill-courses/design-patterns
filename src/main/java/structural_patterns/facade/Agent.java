package structural_patterns.facade;

import java.time.LocalDate;

public class Agent {
    public void housingTrading(Buyer buyer, Seller seller) {
        Contract contract = Contract.builder()
                .name("房屋买卖合同")
                .buyer(buyer)
                .seller(seller)
                .house(seller.getHouse())
                .createDate(LocalDate.now())
                .isRecorded(false)
                .build();

        HousingAuthority housingAuthority = new HousingAuthority();
        housingAuthority.recordContract(contract);
        housingAuthority.transferHouse(buyer, seller);
        Bank bank = new Bank();
        bank.makeLoan(contract);
    }
}
