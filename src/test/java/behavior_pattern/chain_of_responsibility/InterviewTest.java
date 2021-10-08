package behavior_pattern.chain_of_responsibility;

import basic.BasicTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InterviewTest extends BasicTest {

    @Test
    public void should_can_pass_three_interviews() {
        Candidate candidate = Candidate.builder().name("张三").skills(Arrays.asList("java", "effective communication", "agile")).build();

        InterviewChain interviewChain = new InterviewChain();
        interviewChain.addInterview(new PhoneInterview());
        interviewChain.addInterview(new SkillsInterview());
        interviewChain.addInterview(new CultureInterview());

        interviewChain.processInterviews(candidate);

        assertEquals("""
                您好：张三， 欢迎参与面试！
                恭喜你已经通过电话面试
                恭喜你已经通过技能面试
                恭喜你已经通过技能面试""", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_can_pass_one_interview() {
        Candidate candidate = Candidate.builder().name("张三").skills(Arrays.asList("java", "agile")).build();

        InterviewChain interviewChain = new InterviewChain();
        interviewChain.addInterview(new PhoneInterview());
        interviewChain.addInterview(new SkillsInterview());
        interviewChain.addInterview(new CultureInterview());

        interviewChain.processInterviews(candidate);

        assertEquals("""
                您好：张三， 欢迎参与面试！
                很遗憾，您没有通过电话面试""", outputStreamCaptor.toString().trim());
    }

}