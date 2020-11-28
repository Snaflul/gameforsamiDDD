int[] cumy = {150, 150, 150, 150, 150};
int[] time = {0, 0};
Star[] stars = new Star[400];
Boolean start = false;
boolean gameover = false;

void setup() {
  size(800, 800);
  for (int i = 0; i < stars.length; i++) {
    stars[i] = new Star();
  }
}

void draw() {
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
      time();
    }
  }
}


void cum() {
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

  if (gameover) {
    background(0);
    textSize(90);
    fill(255, 0, 0);
    text("GAME OVER U STOPPED CUMMING", 100, 100);
  }
}

void time() {
  time[0]++;
  if (time[0] == 60) {
    time[0] = 0;
    time[1]++;
  }
  textSize(100);
  text(time[1], 200, 200);
}
