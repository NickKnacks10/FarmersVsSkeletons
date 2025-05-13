public class Grid{
    private Icon sprite;
    private String id;

    public Grid(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow, String id){
        sprite = new Icon(spriteStrFirstRow,spriteStrSecondRow,spriteStrThirdRow);
        this.id = id;
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

    public String getId(){
        return id;
    }
}