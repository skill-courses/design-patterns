package behavior_pattern.chain_of_responsibility;

import lombok.Getter;

@Getter
public abstract class Interview {
    protected String name;

    public Interview(String name) {
        this.name = name;
    }

    public abstract Boolean interview(Candidate candidate);
}
