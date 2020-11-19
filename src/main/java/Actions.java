import processing.core.PApplet;

public class Actions {

    PApplet p;
    int low = 1;
    int high;

    Actions(PApplet p){
    this.p = p;

    }

   void createDie(int low, int high){


this.low = low;
this.high=high;


    }

    void createDie(int high){

        this.high=high;


    }


    int dieAction(){
    int terningeKast;
        terningeKast = (int)p.random(low,high+1);

return terningeKast;

    }

}
