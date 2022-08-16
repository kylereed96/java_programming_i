
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.getSquares());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return (this.princePerSquare * this.squares - compared.getPrincePerSquare() * compared.getSquares()) > 0;
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.princePerSquare * this.squares - compared.getPrincePerSquare() * compared.getSquares());
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }
}
