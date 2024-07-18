package moviespackage;

public class SpecialMovie extends Movie {
    public static void main(String[] args) {
        SpecialMovie m3 = new SpecialMovie("Mirchi", "Geetha Creations", "Sukumar", 2, 2018, "Drama", "Dolby", "2D");
        System.out.println(m3.showDetails());
    }
     String soundEffects;
     String visualEffects;

    public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category, String soundEffects, String visualEffects) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + ", Sound Effects: " + soundEffects + ", Visual Effects: " + visualEffects;
    }
}
