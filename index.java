//Put all your variables up here outside the setup or draw functions
//What variables may you want?
//  x, y, number of steps to take, and current steps taken

int n = 300;
int steps = 0;
int x = 200;
int y = 200;


void setup() {
	size(500, 500);
  frameRate(10);
}

void draw() {
	stroke(1);
  //starts random walking from 200,200
  fill(255);
  rect(x, y, 10, 10);
  
  //Here is where you should create the new rectangles to create the illusion of 'random walking'
  // You will need to make sure you dont draw more rectangles than the limit of steps
  //You'll need to use the Math.random() to decide how to create randomness in your drawing of rectangles.
  // Keep your canvas and rectangle width and height as I've given you

  if(steps < 500){
    int _r = (int)(Math.random() * 4);

    if(_r == 0){
      x += 10;
      
      fill(0, 0, 255);
      rect(x, y, 10, 10);
    }else if(_r == 1){
      y += 10;
      
      fill(0, 0, 255);
      rect(x, y, 10, 10);
    }else if(_r == 2){
      x -= 10;
      
      fill(0, 0, 255);
      rect(x, y, 10, 10);
    }else if(_r == 3){
      y -= 10;
      
      fill(0, 0, 255);
      rect(x, y, 10, 10);
    }

    steps++;
  }
 
  
    println("drew rect at: " + x + ", " + y);
    println("Steps taken: " + steps);
}



	



