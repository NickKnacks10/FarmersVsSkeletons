public class Farmer extends Grid{
    private int health;
    private int damage;
    private int attackSpeed;

    private int rowIndex;
    private int colIndex;

    public Farmer(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow, int health, int damage, int attackSpeed, String id){
        super(spriteStrFirstRow, spriteStrSecondRow, spriteStrThirdRow, id);
        this.health = health;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }


}