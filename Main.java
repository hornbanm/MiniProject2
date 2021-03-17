/*
Mini Project 2
@author Group #5: Daniel Hoevener, Noah Hornback, Myron Rankins, Jillian Sizemore
@version 3/15/21

This class runs an Easter Egg Hunt and shows a recap of what all was found during the hunt.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
  // Allows user input to determine number of players
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many players are in this Easter Egg hunt? Enter a positive whole number:");
    int num = s.nextInt();

    while (num < 0) {
      // Makes sure users can't input negative numbers
      System.out.println("You can't do an Easter Egg hunt with less than 0 players. Please enter a positive number:");
      num = s.nextInt();
    }

    ArrayList<Player> players = new ArrayList<Player>();
    // Adds players to the players ArrayList
    for (int i = 0; i < num; i++) {
      players.add(new Player());
    }

    System.out.println("We have added " + num + " players to this hunt. Let’s find some eggs!");
    System.out.println();

    hunt(players);
    recap(players);
    stats(players);
  }

  public static void hunt(ArrayList<Player> thePlayers) {
    // Randomly determines number of eggs found
    // @param thePlayers ArrayList
    Random r = new Random();
    int numEggsFound;

    for (int i = 0; i < thePlayers.size(); i++) {
      numEggsFound = r.nextInt(11);
      for (int n = 0; n < numEggsFound; n++) {
        thePlayers.get(i).foundEgg(new Egg());
      }
    }
  }

  public static void recap(ArrayList<Player> thePlayers) {
    // Prints out how many eggs were found by each players
    // @param thePlayers ArrayList
    for (int i = 0; i < thePlayers.size(); i++) {
      System.out.println("Player " + i + " found " + thePlayers.get(i).getNumEggs() + " eggs");
      thePlayers.get(i).printBasket();
      System.out.println();

    }
  }

  public static void stats(ArrayList<Player> thePlayers) {
    // Determines player who found the most eggs and gives a total
    // @param thePlayers ArrayList
    int mostEggsFoundPlayer = 0;
    int mostEggsFoundNumber = 0;

    for (int i = 0; i < thePlayers.size(); i++) {
      if (thePlayers.get(i).getNumEggs() > mostEggsFoundNumber) {
        mostEggsFoundNumber = thePlayers.get(i).getNumEggs();
        mostEggsFoundPlayer = i;
      }

    }

    System.out
        .println("Player " + mostEggsFoundPlayer + " found the most eggs, with " + mostEggsFoundNumber + " eggs!");
    System.out.println();

    int[] colors = new int[4];
    // Counts the eggs of each color
    for (int i = 0; i < thePlayers.size(); i++) {
      for (int n = 0; n < thePlayers.get(i).getNumEggs(); n++) {
        if (thePlayers.get(i).getBasket().get(n).getColors().equals("blue"))
          colors[0]++;
        if (thePlayers.get(i).getBasket().get(n).getColors().equals("pink"))
          colors[1]++;
        if (thePlayers.get(i).getBasket().get(n).getColors().equals("yellow"))
          colors[2]++;
        if (thePlayers.get(i).getBasket().get(n).getColors().equals("green"))
          colors[3]++;
      }
    }
    // Prints out final stats
    System.out.println("Total Eggs Found:");
    System.out.println("Pink Eggs: " + colors[0]);
    System.out.println("Blue Eggs: " + colors[1]);
    System.out.println("Yellow Eggs: " + colors[2]);
    System.out.println("Green Eggs: " + colors[3]);

  }
}
