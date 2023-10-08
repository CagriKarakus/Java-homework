import java.util.*;
public class Main {
    public static void main(String[] args) {

        int x;
        int tek=0;
        int cift=0;
        for (x=1;x<=50;x=x+1){
            if (x%2 == 1){
                tek=tek+x;
            }
            else if (x%2 == 0){
                cift=cift+x;
            }
        }
        System.out.println("Tek sayilarin toplamı : " + tek);
        System.out.println("Cift sayilarin toplamı : " + cift);

    }
}