public class LeatherSkele extends Skele implements Runnable{
    
    public LeatherSkele(){
        super(
        "  X  ", 
        " | | ", 
        "  ^  ",
        //health, speed, damage, attackSpeed
        600, 100, 50, 100,"skeleLeath" + createIdNum());
    }
}