package p1;

import java.util.Random;

public class P1_Main {

    public static void main(String[] args) {
        int x= new Random().nextInt(6) +1;

        if (x==1 || x==4){
            System.out.println("Gewonnen!");
        }
        else if (x==2){
            System.out.println("Verloren!");
        }
        else if (x==5){
            System.out.println("Unentschieden!");
        }
        else{
            System.out.println("Wüsstest du gerne wa?");
        }

    }

}
