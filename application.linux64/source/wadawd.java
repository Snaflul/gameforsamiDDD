import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class wadawd extends PApplet {

int[] cumy = {150, 150, 150, 150, 150};
Star[] stars = new Star[400];
Boolean start = false;

public void setup() {
  
  for (int i = 0; i < stars.length; i++) {
    stars[i] = new Star();
  }
}

public void draw() {
  noStroke(); // makes ut so no strok!!
  background(0, 0, 0); // black background

  for (int i = 0; i < stars.length; i++) {
    stars[i].update();
    stars[i].show();
  }

  if (!start) {
    textSize(40);
    text("YIN COCK IN SPACETM", 200, 200);
    text("Press any key!!", 200, 500);

    if (keyPressed) {
      start = true;
    }
  }

  if (start) {
    fill(255);
    textSize(50);
    text("YIN COCK", 200, 100);
    textSize(20);
    text("Press 'c' for a surprise :)", 200, 150);
    textSize(10);
    text("I know you're here Sami Alameddine", 500, 200);
    fill(255, 0, 0); // red
    ellipse(300, 250, 100, 200); // tip
    fill(255, 255, 0); // yellow (asia color(
    ellipse(200, 700, 200, 200); // ball
    ellipse(400, 700, 200, 200); // ball
    rect(250, 250, 100, 500); // shaftttt
    fill(0, 0, 0); // black pee HOLE
    rect(300, 150, 10, 70);
    if (keyPressed && key == 'c') {
      cum();
    }
  }
}


public void cum() {
  cumy[1]--;
  cumy[0] -= 2;
  cumy[2] -= 3;
  cumy[3] -= 4;
  cumy[4] -= 5;


  if (cumy[0] <= 0) {
    cumy[0] = 150;
  }
  if (cumy[1] <= 0) {
    cumy[1] = 150;
  }
  if (cumy[2] <= 0) {
    cumy[2] = 150;
  }
  if (cumy[3] <= 0) {
    cumy[3] = 150;
  }
  if (cumy[4] <= 0) {
    cumy[4] = 150;
  }

  fill(255);
  ellipse(300, cumy[0], 50, 50);
  ellipse(300, cumy[1], 50, 50);
  ellipse(300, cumy[2], 50, 50);
  ellipse(300, cumy[3], 50, 50);
  ellipse(300, cumy[4], 50, 50);
}
class Star {
  float x;
  float y;
  float z;

  Star() {   
    x = random(-width, width);
    y = random(-height, height);
    z = random(width);
  }

  public void update() {
    z = z - 10;
    if (z < 1) {
      z = width;
      x = random(-width, width);
      y = random(-height, height);
    }
  }

  public void show() {
    fill(255);
    noStroke();
    float sx = map(x / z, 0, 1, 0, width);
    float sy = map(y / z, 0, 1, 0, width);

    float r = map(z, 0, width, 16, 0);
    ellipse(sx, sy, r, r);
  }
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "wadawd" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
