class Main {
  public static void main(String[] args) {
    int numBottles = 10;

    if (args.length == 1) {
      try {
        numBottles = Integer.parseInt(args[0]);
        if (numBottles > 10) numBottles = 10;
        if (numBottles < 1) numBottles = 1;
      } catch (Exception e) {
        System.err.println("Expected an integer, not " + args[0]);
        return; 
      }
    }

    String song = greenBottles(numBottles);
    System.out.println("\"" + song + "\"");
  }

  public static String greenBottles(int initialBottles) {
    return "";
  }
}
