import java.util.*;
public class Main {
    public static void main(String[] args) {
        int sayi=12345;
        int b=0;
        for(int x=1;x<=5;x+=1){
            if(sayi%10 == 7){
                b=1;
            }
            else {
                sayi= sayi/10;
            }
        }
        switch (b){
            case 0:
                System.out.println("Bulunamadı");
                break;

            case 1:
                System.out.println("Bulundu");
                break;
        }
    }
}