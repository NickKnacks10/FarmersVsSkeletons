public class BasicSkele extends Skele implements Runnable{
    
    public BasicSkele(){
        super(
        "  X  ", 
        "  |  ", 
        "  ^  ",
        //health, speed, damage, attackSpeed
        250, 100, 50, 100,"skeleBasic" + createIdNum());
    }

    
}