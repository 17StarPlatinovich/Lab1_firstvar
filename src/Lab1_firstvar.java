import java.lang.Math;
import java.util.Arrays;

public class Lab1_firstvar {
    public static void main(String[] args) {
        short[] c = new short[13];
        short i;
        for (i = 0; i < c.length; i++) {
            c[i] = (short) (i + 3);
            ++i;
            System.out.println(Arrays.toString(c));
        }
        float[] x = new float[15];
        int j;
        for (j = 0; j < x.length; j++) {
            x[j] = (float) (Math.random() * 13 - 5);
            System.out.println(Arrays.toString(x));
        }
        double[][] d = new double[13][15];
        double pi = 3.14159;
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < x.length; j++) {
                switch(i){
                    case 2 ->
                            d[i][j] = Math.pow(Math.atan(Math.sin(x[j])) / (0.75 + Math.pow((Math.pow((1 - x[j]) / x[j], x[j]) - 4) / 3 / 4, Math.pow(x[j], 2 / x[j]))), 2);
                    case 4, 5, 6, 7, 11, 12 ->
                            d[i][j] = Math.pow(Math.pow(pi * Math.pow((0.5 - x[j]), 3), Math.asin((x[j] + 1.5) / 13) / 2), 2); //объяснение: я с3,14здил эту идею от Лёвы Разуваева и совершенствовал(!), #sorrynotsorry
                    default ->
                            d[i][j] = Math.pow(Math.pow(0.33333 * Math.pow(Math.tan(x[j]), 2), (Math.tan(Math.sin(x[j])) + pi)), 2);
                }System.out.printf("%9.5f", d[i][j]);
            }System.out.println();
        }
    }
}
