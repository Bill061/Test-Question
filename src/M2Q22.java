import java.util.Scanner;

public class M2Q22 {

    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for (int i=3;i<n;i++) {
        for (int j=i+1;j<n;j++) {
            for (int k=j+1;k<n;k++) {
                if (i+k+j)<=n {
                    if ((i*i+j*j)==k*k) {
                        System.out.printf(i);
                    }
                }
            }
        }
    }
}
