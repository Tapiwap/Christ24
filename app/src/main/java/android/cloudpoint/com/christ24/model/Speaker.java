package android.cloudpoint.com.christ24.model;

/**
 * Created by Tsotsoh on 2/26/2018.
 */

public class Speaker {

    private String fullName, time;
    private int image;

    public Speaker(String fullName) {
        this.fullName = fullName;
    }

    public Speaker(String fullName, String time, int image) {
        this.fullName = fullName;
        this.time = time;
        this.image = image;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
