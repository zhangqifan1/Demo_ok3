package com.as.recyclersuspension;

/**
 * -----------------------------
 * Created by zqf on 2018/11/28.
 * ---------------------------
 */
public class TitleBean {
    private String title1;
    private String title2;
    private String title3;

    private String image1;
    private String image2;

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public TitleBean(String title1, String title2, String title3, String image1, String image2) {
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.image1 = image1;
        this.image2 = image2;
    }
}
