package h2;

public class H2_Main {

    public static void main(String[] args) {
        int jahr=2001;
        boolean schalt=false;

        if (jahr%4==0) {
            if(jahr%100==0) {
                schalt=false;
                if(jahr%400==0) {
                    schalt=true;
                }
            }
            else{
                schalt=true;
            }
        }
        else{
            schalt=false;
        }

        System.out.println(jahr);
        System.out.println(schalt);

    }

}
