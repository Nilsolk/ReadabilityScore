package readability;

public class ARI implements Score{
    private int characters;

    public ARI(int characters) {
        this.characters = characters;
    }

    public double score(int words, int sentences) {
        double x = 4.71 * ((double) characters / words) + 0.5 * ((double) words / sentences) - 21.43;
        String str = String.format("%.2f",x);
        return Double.parseDouble(str);
    }

}
