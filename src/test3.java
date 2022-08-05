import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a,s;
        System.out.print("Sayi giriniz: ");
        a = input.nextInt();
        double r = 0;
        for (double i = 1; i <= a; i++){
            r += (1/i);
        }
        System.out.println(r);

    }

}





