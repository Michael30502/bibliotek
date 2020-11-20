package uIHandler;

import processing.core.PApplet;

public class Actions {

    PApplet p;
    int low = 1;
    int high;

    public Actions(PApplet p){
    this.p = p;

    }

   public void createDie(int low, int high){


this.low = low;
this.high=high;


    }

   public void createDie(int high){

        this.high=high;


    }


   public int dieAction(){


       System.out.println("HELP");
return  (int)p.random(low,high+1);

    }

}
