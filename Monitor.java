import java.io.Serializable;
import java.util.List;

public class Monitor extends VideoEquipment implements Serializable {

    private boolean android;
    private static final long serialVersionUID = 1L;


    public boolean isAndroid() {
        return android;
    }

    public void setAndroid(boolean android) {
        this.android = android;
    }

    public Monitor() {

    }



}
