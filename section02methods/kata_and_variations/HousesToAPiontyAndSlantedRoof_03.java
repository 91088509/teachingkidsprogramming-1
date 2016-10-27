package org.teachingkidsprogramming.section02methods.kata_and_variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAPiontyAndSlantedRoof_03
{
  //product owner wants to change to a pointy roof
  //-kata question-
  //how would you make a house with a slanted roof
  //  and a house with a poity roof
  //write steps in english
  //translate into code
  //run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Miles and Nathan");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    //make a skyline with poity roof houses and slanted roof houses
    // make a house with a pointy roof and a current height--#1
    drawHousePointyRoof(height);
    //make a house with a slanted roof and a height of 120 picksels--#2
    drawHouseSlantedRoof(120);
    //make a house with a pointy roof and a height of 90 picksels--#3
    drawHousePointyRoof(90);
    //make a house with a slanted roof and a height of 20 picksels--#4
    drawHouseSlantedRoof(20);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    //make a pointy roof
    //turn the tortoise 45 degrees to the right #1
    Tortoise.turn(45);
    //move the tortoise a pixels #2
    Tortoise.move(30);
    //turn the tortoise 90 degrees to the right #3
    Tortoise.turn(90);
    //move the tortoise a pixels #4
    Tortoise.move(30);
    // turn the tortoise 45 degrees the the right--#5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
  private static void drawSlantedRoof()
  {
    // make a slanted roof
    //turn tortoise 45 ferbreese
    Tortoise.turn(45);
    //move tortoise 30 picksels
    Tortoise.move(30);
    //turn tortoise 135 debris to the right
    Tortoise.turn(135);
    // move the tortoise 20 picksels  
    Tortoise.move(20);
  }
}