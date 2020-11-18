import processing.core.PApplet;
packa
public class Button {
  int x,x2,y,y2;
  String buttonText;
PApplet p ;
Action a;
Button(int x, int x2, int y, int y2, String buttonText, PApplet p){

    this.x = x;
    this.x2= x2;
    this.y = y;
    this.y2 = y2;
    this.p=p;
    this.buttonText = buttonText;

}


public void display(){

    p.rect(x,y,x2,y2);
    p.textAlign(p.LEFT);
    p.text(buttonText,x,y);






}


public void addAction(Action a){

    this.a = a;


}
    public void click(){

    if(p.mouseX<x+x2 && p.mouseX> x&& p.mouseY< y+y2&&p.mouseY>y){

        a.execute();

    }

    }




}
