class Motorcycle {
  String make;
  String color;
  boolean engineState;
  void startEngine() 
  {
    if (engineState == true)
      System.out.println(“The engine is already on.”);
    else 
    {
      engineState = true;
      System.out.println(“The engine is now on.”);
    }
  }
}
