import java.util.ArrayList;

public class Main{
  
  public static ArrayList<Grid>[][] field = new ArrayList[5][9];
  public static boolean alive = true;

  public static void main(String[] args){
    //Creating field
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        field[row][col] = new ArrayList<Grid>();
      }
    }
    
    //Each sprite 5 characters long?
    Grid emptyGrid = new Grid("     ", " ___ ", "     ", "");
    
    LevelReader levelRunner = new LevelReader();
    Thread level = new Thread(levelRunner);
    level.start();
    
    //Printing out the field
    while(alive){
      for(int row = 0; row < field.length; row++){ 
        for(int sectRow = 0; sectRow < 3; sectRow++){
          for(int col = 0; col < field[0].length; col++){
            if(!(field[row][col].size() <= 0)){
              System.out.print("|" + field[row][col].get(0).getSpriteParts(sectRow) + "|   ");
            } else {
              System.out.print("|" + emptyGrid.getSpriteParts(sectRow) + "|   ");
            }
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

    clearConsole();
    System.out.print("Oops, the skeletons got to your house! \nGame Over");
  }

  public static void clearConsole(){ //Thank you, random Youtube Shorts youtuber (adam bien)
    //System.out.print("\033c"); 
  }

}

//Note to self: Threads do in fact work