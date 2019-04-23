package android.cloudpoint.com.christ24.model;

/**
 * Created by Tsotsoh on 2/12/2018.
 */

public class Video {

    private String title, category, description;
    private int thumbnail;

    public Video() {
    }

    public Video(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Video(String title, String category, String description, int thumbnail) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
