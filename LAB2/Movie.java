/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;


/**
 *
 * @author harsh
 */
public class Movie {
    private String movieName;
    private String movieID;
    private String genre;
    private int duration;
    private int releaseYear;
    
    public Movie() {
        System.out.println("Default constructor called");
        movieName = "";
        movieID= "";
        genre = "";
        duration = 0;
        releaseYear = 0000;
}
    public void setMovieName(String name) {
        movieName = name;
    }
    public void setMovieID(String ID) {
        movieID = ID;
    }
    public void setGenre(String setG) {
        genre = setG;
    }
    public void setDuration(int dur) {
        duration = dur;
    }
    public void setReleaseYear(int year) {
        releaseYear = year;
    }
        
    public String getMovieName() {
        return movieName;
    }
    public String getMovieID() {
        return movieID;
    }
    public String getGenre() {
        return genre;
    }
    public int getDuration() {
        return duration;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    
}
