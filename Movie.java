package Quiz;
import java.util.ArrayList;

public class Movie {
  private String title;
  private String director;
  private int year;
  private double rating;
  private double expenses;
  private double earning;
  private ArrayList<Actor> actors = new ArrayList<Actor>();
  public Movie() {}
  public Movie(String title, String director, int year, double rating, double earning, double expenses, ArrayList<Actor> actors) {
    setTitle(title);
    setDirector(director);
    setYear(year);
    setRating(rating);
    setExpenses(expenses);
    setEarning(earning);
    setActors(actors);
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setExpenses(double expenses) {
    this.expenses = expenses;
  }
  public void setDirector(String director) {
    this.director = director;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public void setEarning(double earning) {
    this.earning = earning;
  }
  public void setRating(double rating) {
    this.rating = rating;
  }
  public void setActors(ArrayList<Actor> actors) {
    this.actors = actors;
  }
  public ArrayList<Actor> getActors() {
    return actors;
  }
  public String getDirector() {
    return director;
  }
  public double getEarning() {
    return earning;
  }
  public double getRating() {
    return rating;
  }
  public String getTitle() {
    return title;
  }
  public int getYear() {
    return year;
  }
  public double getExpenses() {
    return expenses;
  }
}
