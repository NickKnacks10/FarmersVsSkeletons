public class Skele extends Grid{
    private int health;
    private int speed; //As a percent
    private int damage;
    private int attackSpeed;

    public Skele(String spriteStrFirstRow, String spriteStrSecondRow, String spriteStrThirdRow, int health, int speed, int damage, int attackSpeed){
        super(spriteStrFirstRow, spriteStrSecondRow, spriteStrThirdRow);
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

    public void move(){
        //
    }
}