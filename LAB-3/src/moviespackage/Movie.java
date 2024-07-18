package moviespackage;

public class Movie {

    public static void main(String[] args) {
        // Exception in thread "main" java.lang.IllegalArgumentException: movieName and producedBy are mandatory fields
        //Movie m1 = new Movie("Kalki", null);
//        Movie movies = new Movie[3];
//        movies[0] = new Movie("Dasara", "Uv", "Nani", 200, "2023", "Action");
//        movies[1] = new SpecialMovie("Remo", "Atlee", "AA", 150, 2016, "Love", "8D", "2D");
//        movies[2] = new InternationalMovie("Avengers", "marvel", "Stan", 200, 2017, "Action", "London", "English");
//        System.out.println(movies.showDetails());

//
//        for(Movie mve : movies) {
//            System.out.println(mve.showDetails());
//        }
        Movie m1 = new Movie("Kalki", "Vyjayanthi");
        Movie m2 = new Movie("Bahubali", "UV", "SSR", 180, 4, "Action");
        System.out.println(m1.showDetails());
        System.out.println(m2.showDetails());
        System.out.println("Total movies created: " + Movie.getMoviesCount());
    }
    //create attributes for 1Q
     String movieName;
     String producedBy;
     String directedBy;
     int duration;
     int year;
     String category;
    //create a static variable moviesCount
    private static  int moviesCount = 0;
    // creating movieId field
    private final String movieId;

// Movie name and produced by are mandatory fields
    public Movie(String movieName, String producedBy) {
        if(movieName == null || producedBy == null || movieName.isEmpty() || producedBy.isEmpty()) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory fields");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.movieId = movieName + "_" + ++moviesCount;
    }
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }
    //get method for movieId -> readOnly
    public String getMovieId() {
        return movieId;
    }
// showDetails() for 5Q
    public String showDetails() {
        return "Movie name: " + movieName + ", Produced by: " + producedBy + ", Directed by: " + directedBy + ", Duration: " + duration + ", Year: " + year + ", Category: " + category + ", Movie ID: " + movieId;
    }
    //Static method for getting moviesCount
    public static int getMoviesCount() {
        return moviesCount;
    }

}
