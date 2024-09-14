 paintYellow();
  }

  public void paintRed() {

    // Paint the red/first stripe of the flag
    
    paintLine("Red", 12);
    turnToWest();
    paintLine("Red", 12);
    turnToEast();
    paintLine("Red", 12);
    turnToWest();
    paintLine("Red", 12);
  }

  public void paintBlue() {

    // Paint the blue/second stripe of the flag
    
    paintLine("Blue", 12);
    turnToWest();
    paintLine("Blue", 12);
    turnToEast();
    paintLine("Blue", 12);
    turnToWest();
    paintLine("Blue", 12);
  }

  public void paintYellow() {

    // Paint the yellow/third stripe of the flag
    
    paintLine("Yellow", 12);
    turnToWest();
    paintLine("Yellow", 12);
    turnToEast();
    paintLine("Yellow", 12);
    turnToWest();
    paintLine("Yellow", 12);
  }

  public void goToBlue() {

    // Get into position to paint the blue/second stripe of the flag
    
    turnAround();
    resetPosition();
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
  }

  public void goToYellow() {

    // Get into position to paint the yellow/third stripe of the flag
    
    turnAround();
    resetPosition();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
  }
}