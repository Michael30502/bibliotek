import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet{

    public static void main(String[] args ) {
        PApplet.main("Main");
    }


    Button buttonTerning6 = new Button(10, 100, 50, 50, "Slå med 6s terning!",this);
    Button buttonTerning10 = new Button(340, 100, 50, 50, "Slå med 10s terning!",this);
    Button buttonTerning12 = new Button(10, 100, 150, 50, "Slå med 12s terning!",this);
    Button buttonTerning100 = new Button(340, 100, 150, 50, "Slå med 100s terning!",this);
    Actions die6 =  new Actions(this);
    Actions die10 = new Actions(this);
    Actions die12 = new Actions(this);
    Actions die100 = new Actions(this);

    int sum;
    int dTerningeKast;
    int terningeKast;
    ArrayList<Dice> dice = new ArrayList();

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


        buttonTerning6.addAction(() -> {
                    terningeKast=  die6.dieAction();
        }
        );

        buttonTerning10.addAction(new Action() {
                                      public void execute() {
                                          terningeKast=   die10.dieAction();

                                      }
                                  }
        );

        buttonTerning12.addAction(new Action() {
                                      public void execute() {
                                          terningeKast= die12.dieAction();

                                      }
                                  }
        );
        buttonTerning100.addAction(new Action() {
                                      public void execute() {
                                          terningeKast=  die100.dieAction();

                                      }
                                  }
        );



    }

    public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        buttonTerning12.display();
        buttonTerning100.display();
        fill(255);
        textAlign(CENTER);
        sum+= terningeKast;
        if(terningeKast!=0)
        dTerningeKast = terningeKast;
        terningeKast=0;
        text("Du har kastet " + dTerningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);
    }

    public void mousePressed() {
        buttonTerning6.click();
        buttonTerning10.click();
        buttonTerning12.click();
        buttonTerning100.click();
    }


}
