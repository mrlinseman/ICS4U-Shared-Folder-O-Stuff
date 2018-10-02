Bubble b1;
Bubble b2;

void setup(){
  size(1000,600);
  b1 = new Bubble(width/2,height,200);
  b2 = new Bubble(width/2+200,height/2,64);
}

void draw() {
  background(255); //White
  b1.display();
  b1.ascend(); //Make bubble move up by one pixel
  b1.top();
  
  b2.ascend(); //Make bubble move up by one pixel
  b2.display();
  b2.top();
}
