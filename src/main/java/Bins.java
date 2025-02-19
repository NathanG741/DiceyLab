
public class Bins {
    int min;
    int max;
    int [] possibleValues;


       /*
   =================================================================
   =================================================================
    */
// Constructors

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        possibleValues = new int[max - min + 1];
    }

    public Integer getBin(int binNumber) {
        return this.possibleValues[binNumber - this.min];

    }
    public void incrementBin(int binNumber) {
        this.possibleValues[binNumber - this.min]++;

    }

    public int[] getPossibleValues() {
        return possibleValues;
    }

    public int getMin() {
        return min;
    }
}
