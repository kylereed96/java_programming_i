public class Film {

    private String filmName;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.filmName = filmName;
        this.ageRating = filmAgeRating;
    }

    public int ageRating() {
        return ageRating;
    }

    public String name() {
        return filmName;
    }
}
