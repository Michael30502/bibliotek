import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args ) {
        PApplet.main("Main");
    }


    Button buttonTerning6 = new Button(10, 100, 150, 50, "Slå med 6s terning!",this);
    Button buttonTerning10 = new Button(340, 100, 150, 50, "Slå med 10s terning!",this);

    int sum;
    int terningeKast;


    @Override
    public void settings() {
        size(500, 300);
    }

    @Override
    public void setup(){

        buttonTerning6.addAction(() -> {
            terningeKast = (int)random(1, 7);
            sum += terningeKast;
        }
        );

        buttonTerning10.addAction(new Action() {
                                      public void execute() {
                                          terningeKast = (int)random(1, 11);
                                          sum += terningeKast;
                                      }
                                  }
        );
    }

    public void draw() {
        clear();
        buttonTerning6.display();
        buttonTerning10.display();
        fill(255);
        textAlign(CENTER);
        text("Du har kastet " + terningeKast, width/2, 200);
        text("Samlet sum    " + sum, width/2, 250);
    }

    public void mousePressed() {
        buttonTerning6.click();
        buttonTerning10.click();
    }


}
