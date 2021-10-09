package behavior_pattern.chain_of_responsibility;

public class PhoneInterview extends Interview {

    public PhoneInterview() {
        super("电话面试");
    }

    @Override
    public boolean isPassInterview(Candidate candidate) {
        return candidate.getSkills().contains("effective communication");
    }
}
