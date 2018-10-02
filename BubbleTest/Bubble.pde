class Bubble{
  //Data or Attributes
  float x; //L/R Pixel Location 
  float y; //T/B Pixel Location
  float d=64; //diamteter of bubble
  float r = random(0,255);
  float g = random(0,255);
  float b = random(0,255);
   
   Bubble(){ //Constructor Method
     x = width/2; //Middle L/R of canvas
     y = height/2; //Bottom of canvas
   } 
   
   Bubble(float x, float y, float d){
     this.x = x;
     this.y = y;
     this.d = d;
   }
      
  //Functionality or Abilities or Procedures  
  void display() {
    noStroke(); //Turn off Outline of shape
    fill(r,g,b); //Multi-Colour Fill
    if(frameCount%120 == 0){
      r = random(0,255);
      g = random(0,255);
      b = random(0,255);
    }
    ellipse(x,y,d,d);
  }
  
  void ascend(){
    y--;
    x = x + random(-2,2);
  }
  
  void top(){
    if(y<d/2){
      y++; //Stays at top
    }
  }
  
}
