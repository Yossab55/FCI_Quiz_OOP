package Quiz;
import java.util.ArrayList;
public class MoviesDataSet {
  private ArrayList<Movie> movies = new ArrayList<Movie>();
  public MoviesDataSet() {}
  public MoviesDataSet(ArrayList<Movie> movies) {
    setMovies(movies);
  }
  public void setMovies(ArrayList<Movie> movies) {
    this.movies = movies;
  }
  public ArrayList<Movie> getMovies() {
    return movies;
  }
  // method A
  public ArrayList<Movie> moviesByDirector(String director) {
    ArrayList<Movie> result = new ArrayList<Movie>();
    ArrayList<Movie> tempMovies = getMovies();
    for(int i = 0 ; i < tempMovies.size(); i++) {
      if(director == tempMovies.get(i).getDirector()) 
        result.add(tempMovies.get(i));
    }
    return result;
  }
  // Method B 
  public ArrayList<Movie> moviesByActor(String actor) {
    ArrayList<Movie> result = new ArrayList<Movie>();
    ArrayList<Movie> tempMovies = getMovies();
    for(int i = 0 ; i < tempMovies.size(); i++) {
      ArrayList<Actor> tempActors = new ArrayList<Actor>();
      tempActors = tempMovies.get(i).getActors();
      for(int j = 0; j < tempActors.size(); j++) {
        if(actor == tempActors.get(j).getName()) 
          result.add(tempMovies.get(i));
      }
    }
    return result;
  }
  // Method C
  public ArrayList<String> gainedProfitMovies() {
    ArrayList<Movie> tempMovies = new ArrayList<Movie>();
    tempMovies = getMovies();
    ArrayList<String> result = new ArrayList<String>();
    for(int i = 0; i < tempMovies.size(); i++) {
      double expenses = tempMovies.get(i).getExpenses();
      double earning = tempMovies.get(i).getEarning();
      if(earning > expenses) 
        result.add(tempMovies.get(i).getTitle());
    }
    return result;
  }
  //Method D
  public String highestRatingMovie(int year) {
    String result = "";
    ArrayList<Movie> tempMovies = new ArrayList<Movie>();
    tempMovies = getMovies();
    ArrayList<Movie> filteredMovies = new ArrayList<Movie>();
    if(year == 0) filteredMovies = tempMovies;
    else {
      for(int i = 0; i < tempMovies.size(); i++) {
        if(year == tempMovies.get(i).getYear()) 
          filteredMovies.add(tempMovies.get(i));
      }
    }
    result = filteredMovies.get(0).getTitle();
    double rating = filteredMovies.get(0).getRating();
    for(int i = 1; i < filteredMovies.size(); i++) {
      if(rating < filteredMovies.get(i).getRating()) {
        result = filteredMovies.get(i).getTitle();
        rating = filteredMovies.get(i).getRating();
      }
    }
    return result;
  }
}
