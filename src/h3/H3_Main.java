package h3;

public class H3_Main {

    public static void main(String[] args) {
        int max=200;
        int fix=150;
        int wartend=5;
        boolean istVoll=false;

        while (fix<max && wartend>0) {
            wartend--;
            fix++;
        }

        if (fix==max) {
            istVoll=true;
        }
        else {
            istVoll=false;
        }

        System.out.println(max);            //el testo
        System.out.println(fix);
        System.out.println(wartend);
        System.out.println(istVoll);
    }

}
