package com.example.android.takehomeassignment08_katieb;

/**
 * Created by katie on 3/26/17.
 */

public class MovieSorter {
    private boolean inStock;
    private int minutes;
    private String title;

    public MovieSorter(boolean inStock, int minutes, String title) {
        this.inStock = inStock;
        this.minutes = minutes;
        this.title = title;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + "\n" +
                "In Stock: " + inStock + "\n" +
                "Minutes: " + minutes;
    }


}
