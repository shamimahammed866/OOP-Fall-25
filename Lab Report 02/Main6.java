package com.mycompany.main6;

    class Movie {
    private String title;
    private String director;
    private double duration; 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getMovieDetails() {
        return "Movie Title: " + title +
               "\nDirector: " + director +
               "\nDuration: " + duration + " hours";
    }   
}

public class Main6{
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Ayla");
        movie.setDirector("Can Ulkay");
        movie.setDuration(2.6);

        System.out.println(movie.getMovieDetails());
    }
}
