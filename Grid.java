public class Grid{
    private Icon sprite;

    public Grid(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow){
        sprite = new Icon(spriteStrFirstRow,spriteStrSecondRow,spriteStrThirdRow);
    }

    //Prerequisite: pos == 0, 1, or 2 
    public String getSpriteParts(int pos){
        if(pos == 0){
            return sprite.getFirst();
        }
        if(pos == 1){
            return sprite.getSecond();
        }
        return sprite.getThird();
    }
    // Broken right now
    public String toString(){
        return "| +"sprite+" |";
    }
}