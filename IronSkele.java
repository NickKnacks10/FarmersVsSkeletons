public class IronSkele extends Skele implements Runnable{
    
    public IronSkele(){
        super(
        " {X} ", 
        " | | ", 
        "  ^  ",
        //health, speed, damage, attackSpeed
        1000, 100, 50, 100,"skeleIron" + createIdNum());
    }
}