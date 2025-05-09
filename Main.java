public class Main{
  public static void main(String[] args){
    System.out.println("Field Test");
    Grid[][] field = new Grid[5][9];
    //Just testing out the field generation
    for(int row = 0; row < field.length; row++){
      for(int col = 0; col < field[0].length; col++){
        Grid[row][col] = new Grid("I I", "I_I", "I I");
      }
    }
    //Printing out the field
    for(int row = 0; row < field.length; row++){ 
      for(int sectRow = 0; sectRow < 3; sectRow++){
        for(int col = 0; col < field[0].length; col++){
          System.out.print(Grid[sectRow][col].getSpriteParts(sectRow) + "   ");
        }
        System.out.println();
      }
      System.out.println("\n");
    }


  }
}