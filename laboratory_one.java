public class Laboratory_one {
  public static float rand(float min, float max) {
    max -= min;
    return ((float)Math.random() * max) + min;
  }
  
  public static double convert(int z_, float x_, int[] numbers_) {
      if (z_ == 2) {
          return Math.cos(Math.asin(Math.cos(x_)));
      } else {
          for (int coin : numbers_) {
              if (z_ == coin) {
                  return Math.tan((Math.tan(x_) + 1) / Math.cbrt(x_));
              }
          }
          return Math.asin(Math.exp(Math.cbrt(-1 * Math.exp(Math.pow(Math.cbrt(x_), (0.75 - Math.log(Math.abs(x_))) / 3.0)))));
      }
  }
  
  public static void print(double[][] numb) {
      for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 11; j++) {
            System.out.printf("%.2f ", numb[i][j]);
        }
        System.out.println();
    }
  }

  public static void main(String[] args) {
    int[] z = new int[11];
    float[] x = new float[11];
    double[][] z1 = new double[11][11];
    int[] numbers = {6, 12, 14, 16, 18};
    int flag = 0;

    for (int i = 1; i <= 11; i++) {
        z[i - 1] = i * 2;
    }

    for (int i = 0; i < 11; i++) {
        x[i] = rand(-15.0F, 3.0F);
    }

    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 11; j++) {
            z1[i][j] = convert(z[i], x[j], numbers);
        }
    }

    print(z1);
  }
}
