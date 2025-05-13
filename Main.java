import java.util.ArrayList;

public class Main{

  

  public static void main(String[] args){
    //Maybe change to a 2D array of Arraylists containing Grid objects to handle multiple skeletons of the same tile
    ArrayList<Grid>[][] field = new ArrayList[5][9];;
    
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        field[row][col] = new ArrayList<Grid>();
      }
    }

    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        //5 Characters long?
        field[row][col].add(new Grid("     ", " ___ ", "     ", ""));
      }
    }

    //Printing out the field
    while(true){
      for(int row = 0; row < field.length; row++){ 
        for(int sectRow = 0; sectRow < 3; sectRow++){
          for(int col = 0; col < field[0].length; col++){
            System.out.print("|" + field[sectRow][col].get(0).getSpriteParts(sectRow) + "|   ");
          }
          System.out.println();
        }
        System.out.println("\n");
      }
      //To clarify: This try/catch was added by an AI
      try {
        Thread.sleep(1000);
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

}

//Note to self: Threads do in fact work