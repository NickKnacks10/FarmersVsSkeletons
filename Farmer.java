public class Farmer extends Grid{
    private int health;
    private int speed; //As a percent
    private int damage;
    private int attackSpeed;

    public Farmer(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow, int health, int speed, int damage, int attackSpeed, String id){
        super(spriteStrFirstRow, spriteStrSecondRow, spriteStrThirdRow, id);
    }

}