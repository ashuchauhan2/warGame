package VillageMap;
import java.time.*;

public class Workers {
    private boolean isAvailable;

    public Workers() {
        isAvailable = true;
    }

    public boolean useWorker(Duration duration) {
        return isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
