import java.util.ArrayList;

public class Skele extends Grid{
    public static int idNum = 0;
    private int health;
    private int speed; //As a percent
    private int damage;
    private int attackSpeed;

    private int rowIndex;
    private int colIndex;

    public Skele(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow, int health, int speed, int damage, int attackSpeed, String id){
        super(spriteStrFirstRow, spriteStrSecondRow, spriteStrThirdRow, id);
        this.health = health;
        this.speed = speed;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public void attack(){
        //
    }

    public void loseHealth(int att){
        health -= att;
    }

    /* Finds where the current skeleton is, removes it from its previous arraylist, and puts it in the next adjacent one */
    public void move(ArrayList<Grid>[][] field){
        //TODO: Add interactions with farmers
        int curPos = 0;
        for(int row = 0; row < field.length; row++){
            for(int col = 0; col < field[0].length; col++){
                for(int index = 0; index < field[row][col].size(); index++){
                    if(field[row][col].get(index).getId().equals(this.getId())){
                        curPos = index;
                    }
                }
            }
        }
        field[rowIndex][colIndex-1].add(field[rowIndex][colIndex].remove(curPos));
    }

    public static String createIdNum(){
        String strId = "";
        idNum++;
        for(int i = 0; i < 7 - Integer.toString(idNum).length(); i++){
            strId += 0;
        }
        strId += idNum;
        return strId;
    }
}