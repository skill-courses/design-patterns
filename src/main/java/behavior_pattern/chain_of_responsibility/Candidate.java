package behavior_pattern.chain_of_responsibility;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Candidate {
    private String name;
    private List<String> skills;
}
