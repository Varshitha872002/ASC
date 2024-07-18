package moviespackage;

public class InternationalMovie extends Movie {
    public static void main(String[] args) {
        InternationalMovie m4 = new InternationalMovie("Iron man", "Marvel", "Stanlee", 3, 2017, "Superhero", "United States", "English");
        System.out.println(m4.showDetails());
    }
     String country;
     String language;

    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + ", Country: " + country + ", Language: " + language;
    }
}
