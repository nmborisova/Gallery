/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.gallery.frames;

/**
 *
 * @author smgAF75
 */
public class Painting {
    private String authorName;
    private double price;
    private int year;
    private String info;
    private String image;

    public Painting() {
    }

    public Painting(String authorName, double price, int year, String info, String image) {
        this.authorName = authorName;
        this.price = price;
        this.year = year;
        this.info = info;
        this.image = image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
   

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    
    
}
