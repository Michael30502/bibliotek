package uIHandler;
import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args ) {
        PApplet.main("uIHandler.Main");
    }


    GUIHandler gUIhandler = new GUIHandler(this);

    Actions die6 =  new Actions(this);
    Actions die10 = new Actions(this);
    Actions die12 = new Actions(this);
    Actions die100 = new Actions(this);

    int sum;
    int dTerningeKast;
    int terningeKast;

    @Override
    public void settings() {
        size(500, 300);
    }

    @Override
    public void setup(){

        die6.createDie(6);
        die10.createDie(10);
        die12.createDie(12);
        die100.createDie(100);


        gUIhandler.createButton(10,50,10,50,"Cool Button",die6);
        terningeKast= gUIhandler.createAction();
        println(terningeKast);
    }

    public void draw() {
        clear();
        gUIhandler.display();
        fill(255);
        textAlign(CENTER);
        sum+= terningeKast[0];
        if(terningeKast[0]!=0)
        dTerningeKast = terningeKast[0];
        terningeKast[0]=0;
        text("Du har kastet " + dTerningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);
    }

    public void mousePressed() {
   gUIhandler.click();
    }


}
