package structural_patterns.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class House {
    private String location;
    private int size;
    private int price;
    private People owner;
}
