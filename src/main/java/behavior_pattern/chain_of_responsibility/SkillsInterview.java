package behavior_pattern.chain_of_responsibility;

public class SkillsInterview extends Interview {

    public SkillsInterview() {
        super("技能面试");
    }

    @Override
    public boolean isPassInterview(Candidate candidate) {
        return candidate.getSkills().contains("java");
    }
}
