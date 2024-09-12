public class Laboratory_one {
  public static double rand(double min, double max) {
    max -= min;
    return (Math.random() * ++max) + min;
  }
  public static void main(String[] args) {
    int[] s;
    s = new int[11];
    for (int i = 1; i <= 11; i++) {
        s[i - 1] = i * 2;
        System.err.println(s[i - 1]);
    }
  }
}
