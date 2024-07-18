package moviespackage;

public class ArrayInput {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("Kalki", "Vyjayanthi");
        movies[1] = new SpecialMovie("Mirchi", "Geetha Creations", "Sukumar", 2, 2018, "Drama", "Dolby", "2D");
        movies[2] = new InternationalMovie("Iron man", "Marvel", "Stanlee", 3, 2017, "Superhero", "United States", "English");
       // Using a single for loop traverse the above array and call the method showDetails() on all the objects of the array.
        for(Movie movie : movies) {
            System.out.println(movie.showDetails());
            //call the methods of SpecialMovie and InternationalMovie while traversing the array inside the for loop. If not, use typecasting to do this.
            if(movie instanceof SpecialMovie) {
                SpecialMovie specialMovie = (SpecialMovie) movie;
                System.out.println("Special Movie effects: " + specialMovie.soundEffects);
            } else if (movie instanceof InternationalMovie) {
                InternationalMovie internationalMovie = (InternationalMovie) movie;
                System.out.println("International Movie Language: " + internationalMovie.country);
            }
        }
    }
}
