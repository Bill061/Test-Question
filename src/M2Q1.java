import java.util.Scanner;

public class M2Q1 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float n=scn.nextFloat();
        float max=n;
        float min=n;
        for(int i=0;i<10;i++) {
            n=scn.nextFloat();
            if (max < n) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
        }
        System.out.printf("max=%.2f\n", max);
        System.out.printf("min=%.2f\n", min);
    }
}
