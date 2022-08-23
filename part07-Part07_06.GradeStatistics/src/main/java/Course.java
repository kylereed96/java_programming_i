import java.util.ArrayList;
import java.util.Collections;

public class Course {

    private ArrayList<Integer> points;

    public Course() {
        this.points = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (point > 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public double pointAverage() {
        int sum = 0;
        for (int point:points) {
            sum += point;
        }
        return (double) sum / points.size();
    }

    public ArrayList<Integer> passList() {
        ArrayList<Integer> passes = new ArrayList<>();
        for (int point : points) {
            if (point >= 50) {
                passes.add(point);
            }
        }
        return passes;
    }

    public double passAverage() {
        int sum = 0;
        ArrayList<Integer> passes = passList();

        if (passes.size() == 0) {
            return -1;
        }

        for (int point:passes) {
            sum += point;
        }
        return (double) sum / passes.size();
    }

    public double passPercentage() {
        return (double) passList().size() / points.size() * 100;
    }

    public int[] gradeDistribution() {
        int[] distribution = new int[6];
        int[] gradeBoundaries = {50, 60, 70, 80, 90, 100};

        Collections.sort(points);

        int index = 0;
        int numAtGrade = 0;

        for (int i = 0; i < distribution.length; i++) {
            int gradeBoundary = gradeBoundaries[i];
            while (index < points.size() && points.get(index) < gradeBoundary) {
                numAtGrade += 1;
                index++;
            }
            distribution[i] = numAtGrade;
            numAtGrade = 0;
        }
        return distribution;
    }

    public void printStatistics() {
        System.out.printf("Point average (all): %s%n", pointAverage());
        System.out.printf("Point average (passing): %s%n", passAverage());
        System.out.printf("Pass percentage: %s%n", passPercentage());
        System.out.println("Grade distribution:");
        int[] gradeDistribution = gradeDistribution();
        for (int i = gradeDistribution.length - 1; i >= 0 ; i--) {
            System.out.printf("%s: ", i);
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}

