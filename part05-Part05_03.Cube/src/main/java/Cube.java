public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    public String toString() {
        return  String.format("The length of the edge is %s and the volume %s", edgeLength, volume());
    }
}
