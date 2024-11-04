package Quiz;
import java.util.ArrayList;

public class Main {
  public static void main(String args []) {
    Actor act1 = new Actor("ahmed", "Male");
    Actor act2 = new Actor("Yossab", "Male");
    Actor act3 = new Actor("mona", "Female");
    ArrayList<Actor> actors1 = new ArrayList<Actor>();
    actors1.add(act1);
    actors1.add(act2);
    Movie m1 = new Movie("movie1", "d1", 2000, 4.3,  1000, 2000, actors1);
    ArrayList<Actor> actors2 = new ArrayList<Actor>();
    actors2.add(act1);
    actors2.add(act2);
    actors2.add(act3);
    Movie m2 = new Movie("movie2", "d2", 2000, 4.6,  1000, 1500, actors2);
    ArrayList<Movie> arrayMovies = new ArrayList<Movie>();
    arrayMovies.add(m1);
    arrayMovies.add(m2);
    MoviesDataSet myMovies = new MoviesDataSet(arrayMovies);
    ArrayList<Movie> moviesMadeByD1 = myMovies.moviesByDirector("d1");
    System.out.println("movies made by dic 1 is\n" + moviesMadeByD1.get(0).getTitle());
  }
}
