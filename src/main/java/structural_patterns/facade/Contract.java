package structural_patterns.facade;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class Contract {
    private String name;
    private Buyer buyer;
    private Seller seller;
    private House house;
    private LocalDate createDate;
    private Boolean isRecorded;
}
