
/*
Mini Project 2
@author Group #5: Daniel Hoevener, Noah Hornback, Myron Rankins, Jillian Sizemore
@version 3/15/21

This class randomly sets up the color and content of the eggs.
*/

import java.util.Random;

class Egg {
  private String color;
  private String contents;

  Egg() {
    // Gives random color and contents to egg
    color = randomColor();
    contents = randomContents();
  }

  public String randomColor() {
    // Creates array of colors and generates one randomly for each egg
    // @return the random egg color
    Random r = new Random();
    String colors[] = { "blue", "pink", "yellow", "green" };
    int color = r.nextInt(4);
    return colors[color];
  }

  public String randomContents() {
    // Creates array of content and generates one randomly for each egg
    // @return the random egg content
    Random r = new Random();
    String contents[] = { "Cadbury Egg", "Reese's Egg", "Pink Starbust", "Yellow Peep", "25 cents", "50 cents",
        "One dollar" };
    int content = r.nextInt(7);
    return contents[content];

  }

  public String getColors() {
    // Accesses the egg's color
    // @return the color of the egg
    return color;
  }

  public String getContents() {
    // Accesses the egg's contents
    // @return the content of the egg
    return contents;
  }

  public void printEgg() {
    // prints out random color and content of egg
    System.out.println(color + " egg contains " + contents);
  }
}