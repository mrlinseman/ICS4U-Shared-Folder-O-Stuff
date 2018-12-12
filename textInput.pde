// ICS4U
// Denzel Baptiste
// May 31st, 2018
// Character Input Example
// Allows you to enter text and view what you're typing

String input = ""; // holding input
PFont f; // making a font

void setup() {
  size(600, 600);
  f = createFont("Arial",32,true); // setting the font
}

void draw() {
  background(#7205A2); // setting the background color
  textFont(f); // choosing the created font
  text(input, 50, 50); // displaying the text
}

void keyPressed() {
  if (keyCode == BACKSPACE && input.length() > 0) { // removing a character if backspaced is pressed
    input = input.substring(0, input.length() - 1); 
  } else if (keyCode != 20 && keyCode != 16 && keyCode != 17 && keyCode != 9 && keyCode != 8) { // https://goo.gl/y4e5Us for keycode info
    input += key; // adds pressed key to input  
  }
  
  System.out.println(keyCode); // prints out the characters keyCode in console 
}
