package uIHandler;
import processing.core.PApplet;
import java.util.ArrayList;

public class GUIHandler {

    ArrayList<Button> buttons = new ArrayList<>();

    PApplet p;
    int counter = 0;

    GUIHandler(PApplet p){
        this.p = p;

    }



    public void createButton(int x, int x2, int y, int y2, String buttonText,Actions a){
    buttons.add(new Button(x, x2, y, y2, buttonText,p));
        buttons.get(counter).addAction(new Action() {
                                         public void execute() {
                                             a.dieAction();

                                         }
                                     }
        );
    counter++;


    }

    public int createAction(int count,){
        int dieThrow;

        return dieThrow;
    }

    public void display(){
        for (int i =0;i<buttons.size();i++) {
            buttons.get(i).display();
        }
    }

    public void click(){
        for (int i =0;i<buttons.size();i++) {
            buttons.get(i).click();
        }


    }



}
