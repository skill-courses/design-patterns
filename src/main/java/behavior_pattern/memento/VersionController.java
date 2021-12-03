package behavior_pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class VersionController {
    private int currentVersion = 0;
    private List<FileSnapshot> fileSnapshots = new ArrayList<>();

    public int commit(File file) {
        currentVersion ++;
        fileSnapshots.add(new FileSnapshot(currentVersion, file));
        return currentVersion;
    }

    public File reset() {
        currentVersion --;
        return fileSnapshots.stream().filter(fileSnapshot -> fileSnapshot.getVersion() == currentVersion).map(fileSnapshot -> fileSnapshot.getFile()).findFirst().orElseThrow();
    }
}
