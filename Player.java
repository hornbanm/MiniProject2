/*
Mini Project 2
@author Group #5: Daniel Hoevener, Noah Hornback, Myron Rankins, Jillian Sizemore
@version Date: 3/15/21

This class decides the eggs that will be found by each player and builds the basket.
*/

import java.util.ArrayList;

class Player {
  private int eggs;
  private ArrayList<Egg> basket;

  Player() {
    // constructor for the basket with no parameters
    eggs = 0;
    basket = new ArrayList<Egg>();
  }

  public int getNumEggs() {
    // accessor for number of eggs
    // @return number of eggs
    return eggs;
  }

  public ArrayList<Egg> getBasket() {
    // Accesses basket
    // @return basket
    return basket;
  }

  public void printBasket() {
    // prints out the contents of the basket
    for (int i = 0; i < basket.size(); i++) {
      basket.get(i).printEgg();
    }
  }

  public void foundEgg(Egg foundAnEgg) {
    // Adds an egg to the basket
    // @param FoundAnEgg
    eggs++;
    basket.add(foundAnEgg);
  }

}
