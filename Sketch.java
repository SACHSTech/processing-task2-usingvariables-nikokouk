import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(700, 200);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(77, 118, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    //Drawing ground (rectangle)

    fill(18, 74, 19);
    stroke(200);
    rect((0), (float) (height / 1.6), (width), (height));

    //Drawing house base (rectangle)
    
    fill(110, 31, 31);
    rect((float) (width/4), (float) (height/2), (float) (width/4), (float) (height/4));

    //Drawing door (rectangles)
    
    fill(166, 86, 2);
    //rect(120, 260, 25, 40 );
    rect((float) (width/3.33), (float) (height*.65), (float) (width/16), (float) (height/10));

    //Drawing windows (rectangles)

    fill(245, 230, 215);
    //rect(120, 220, 60, 30);
    rect((float) (width/3.33), (float) (height/1.818), (float) (width/6.666), (float) (height/13.33));

    //Drawing roof (triangle)

    fill(135, 34, 27);
    //triangle(100, 200, 200, 200, 150, 160);
    triangle((float) (width/4), (float) (height/2), (float) (width/2), (float) (height/2), (float) (width/2.66), (float) (height/2.5));

    //Drawing sun (circle)

    fill(252, 227, 3);
    //ellipse(300, 70, 80, 80);
    ellipse((float) (width/1.333), (float) (height*.175), (float) (width/5), (float) (height/5));

  }
  
  // define other methods down here.
}