package readability;

public class SMOG implements Score{
    private int polysyllables;

    public SMOG(int polysyllables) {
        this.polysyllables = polysyllables;
    }

    @Override
    public double score(int words, int sentences) {
        double x = 1.043 * Math.sqrt((double) polysyllables * 30 /sentences) + 3.1291;
        String str = String.format("%.2f",x);
        return Double.parseDouble(str);
    }
}
