package behavior_pattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class InterviewChain {
    private List<Interview> interviews = new ArrayList<>();

    public void addInterview(Interview interview) {
        this.interviews.add(interview);
    }

    public void processInterviews(Candidate candidate) {
        System.out.println("您好：" + candidate.getName() + "， 欢迎参与面试！");
        for (Interview interview : interviews) {
            if (interview.interview(candidate)) {
                System.out.println("恭喜你已经通过" + interview.getName());
            } else {
                System.out.println("很遗憾，您没有通过" + interview.getName());
                break;
            }
        }
    }
}
