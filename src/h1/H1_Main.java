package h1;

public class H1_Main {

    public static void main(String[] args) {
        double guthaben=1440;
        double monEingang=500;
        int rating=7;
        boolean warnhinweis=false;
        boolean negativ=false;

        if(guthaben<0){
            negativ=true;

            if(monEingang>=guthaben){
                rating=rating+1;
            }
            else {
                rating=rating-1;

                if(rating<0){
                    warnhinweis=true;
                }
                else{
                    warnhinweis=false;
                }
            }

        }
        else{
            negativ=false;
        }

        if(guthaben>0){
            rating=rating+3;
        }

        if(guthaben==0){
            rating=rating+2;
        }



    }


}
