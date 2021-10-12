package behavior_pattern.command;

import java.util.List;

public interface OrderCommand {
    void execute(List<String> dishes);

    void cancel(List<String> dishes);
}
