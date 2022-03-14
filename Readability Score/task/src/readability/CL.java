package readability;

public class CL implements Score{
    private int characters;

    public CL(int characters) {
        this.characters = characters;
    }

    @Override
    public double score(int words, int sentences) {
      double x = 0.0588 * ((double) characters / words * 100) - 0.296 * ((double) sentences / words * 100) - 15.8;
      String str = String.format("%.2f",x);
      return Double.parseDouble(str);
    }
}
