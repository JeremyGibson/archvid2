package models.file_d_type;

/**
 * Created by TheApexGibsons on 2/26/2015.
 */
public class Tracking {
    private Integer ID;

    private String tracking_type;
    private String tracking_value;

    public Tracking(Integer ID, String tracking_type, String tracking_value) {
        this.ID = ID;
        this.tracking_type = tracking_type;
        this.tracking_value = tracking_value;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTracking_type() {
        return tracking_type;
    }

    public void setTracking_type(String tracking_type) {
        this.tracking_type = tracking_type;
    }

    public String getTracking_value() {
        return tracking_value;
    }

    public void setTracking_value(String tracking_value) {
        this.tracking_value = tracking_value;
    }
}
