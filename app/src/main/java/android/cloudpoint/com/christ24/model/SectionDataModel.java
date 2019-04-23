package android.cloudpoint.com.christ24.model;

import java.util.ArrayList;

/**
 * Created by Tsotsoh on 2/15/2018.
 */

public class SectionDataModel {

    private String sectionTitle;
    private ArrayList<Video> videoList;

    public SectionDataModel() {
    }

    public SectionDataModel(String sectionTitle, ArrayList<Video> videoList) {
        this.sectionTitle = sectionTitle;
        this.videoList = videoList;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public ArrayList<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(ArrayList<Video> videoList) {
        this.videoList = videoList;
    }
}
