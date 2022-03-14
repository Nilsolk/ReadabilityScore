package readability;

public class FleshKincaid implements Score {
    private int syllables;

    public FleshKincaid(int syllables) {
        this.syllables = syllables;
    }

    @Override
    public double score(int words, int sentences) {
        double x = 0.39 * ((double) words / sentences) + 11.8 * ((double)syllables / words) - 15.59;
        String str = String.format("%.2f",x);
        return Double.parseDouble(str);
    }
}
