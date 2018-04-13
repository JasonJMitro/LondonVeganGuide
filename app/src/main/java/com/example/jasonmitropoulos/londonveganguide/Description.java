package com.example.jasonmitropoulos.londonveganguide;


public class Description {

    private int mImage1;

    private String mDescription;

    private int mImage2;

    private String mUrl;


    /**
     * Create a new Description object.
     */
    public Description(int image1, String description, int image2, String url) {
        mDescription = description;
        mImage1 = image1;
        mImage2 = image2;
        mUrl = url;
    }

    /**
     * Return description
     */
    public String getDescription() {
        return mDescription;
    }


    /**
     * Return image1
     */
    public int getImage1() {
        return mImage1;
    }

    /**
     * Return image2
     */
    public int getImage2() {
        return mImage2;
    }

    /**
     * Return Url
     */
    public String getUrl() {
        return mUrl;
    }


}
