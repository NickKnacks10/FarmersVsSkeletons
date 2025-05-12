public class Main{
  public static void main(String[] args){
    System.out.println("Field Test");
    Grid[][] field = new Grid[5][9];
    //Just testing out the field generation
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        //5 Characters long?
        field[row][col] = new Grid("     ", " ___ ", "     ");
      }
    }
    //Printing out the field
    for(int row = 0; row < field.length; row++){ 
      for(int sectRow = 0; sectRow < 3; sectRow++){
        for(int col = 0; col < field[0].length; col++){
          System.out.print("|" + field[sectRow][col].getSpriteParts(sectRow) + "|   ");
        }
        System.out.println();
      }
      System.out.println("\n");
    }
  }

  public static void clearConsole(){ //May or may not work; have to test at home
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}