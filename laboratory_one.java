public class Laboratory_one {
  public static float rand(float min, float max) {
    max -= min;
    return ((float)Math.random() * max) + min;
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
            if (z[i] == 2) {
                z1[i][j] = Math.cos(Math.asin(Math.cos(x[j])));
            } else {
                for (int coin : numbers) {
                    if (z[i] == coin) {
                        z1[i][j] = Math.tan((Math.tan(x[j]) + 1) / Math.cbrt(x[j]));
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    z1[i][j] = Math.asin(Math.exp(Math.cbrt(-1 * Math.exp(Math.pow(Math.cbrt(x[j]), (0.75 - Math.log(Math.abs(x[j]))) / 3.0)))));
                }
            }
        }
    }

    for (int i = 0; i < 11; i++) {
        for (int j = 0; j < 11; j++) {
            System.out.printf("%.2f", z1[i][j]);
            System.out.print(' ');
        }
        System.out.println();
    }
  }
}
