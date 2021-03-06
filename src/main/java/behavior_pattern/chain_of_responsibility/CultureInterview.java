package behavior_pattern.chain_of_responsibility;

public class CultureInterview extends Interview {
    public CultureInterview() {
        super("技能面试");
    }

    @Override
    public boolean isPassInterview(Candidate candidate) {
        return candidate.getSkills().contains("agile");
    }
}
