public class Main extends Thread{
  public static void main(String[] args){
    System.out.println("Field Test");
    //Maybe change to a 2D array of Arraylists containing Grid objects to handle multiple skeletons of the same tile
    
    Grid[][] field = new Grid[5][9];
    
    //Attempt 1 to make 2d array of arraylists
    /*
    Arraylist<Grid>[][] field = new Arraylist<Grid>[5][9];
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        field[row][col] = new ArrayList<Grid>();
      }
    }

    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        //5 Characters long?
        field[row][col].add(new Grid("     ", "     ", "     "));
      }
    }
    */

    //Just testing out the field generation
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        //5 Characters long?
        field[row][col] = new Grid("     ", " ___ ", "     ");
      }
    }
    //Testing threads here; No idea if this works yet
    Main thread = new Main();
    thread.start();

    //Printing out the field
    while(true){
      for(int row = 0; row < field.length; row++){ 
        for(int sectRow = 0; sectRow < 3; sectRow++){
          for(int col = 0; col < field[0].length; col++){
            System.out.print("|" + field[sectRow][col].getSpriteParts(sectRow) + "|   ");
          }
          System.out.println();
        }
        System.out.println("\n");
      }
      //To clarify: This try/catch was added by an AI
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("");
      clearConsole();
    }
  }

  public static void clearConsole(){ //Thank you, random Youtube Shorts youtuber (adam bien)
    System.out.print("\033c"); 
  }

  public void run(){
    System.out.println("Thread testing");
  }
}