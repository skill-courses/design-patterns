package behavior_pattern.chain_of_responsibility;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public abstract class Interview {
    protected String name;
    protected Optional<Interview> nextInterview = Optional.empty();

    public Interview(String name) {
        this.name = name;
    }

    public void interview(Candidate candidate) {
        System.out.println("您好：" + candidate.getName() + "， 欢迎参与" + this.name + "！");
        if (isPassInterview(candidate)) {
            System.out.println("恭喜你已经通过" + this.getName());
            nextInterview.ifPresent(interview -> interview.interview(candidate));
        } else {
            System.out.println("很遗憾，您没有通过" + this.getName());
        }
    }

    public abstract boolean isPassInterview(Candidate candidate);
}
