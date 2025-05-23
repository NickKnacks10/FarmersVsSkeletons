
public class Skele extends Grid implements Runnable{
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

    public void setPosition(int row, int col){
        rowIndex = row;
        colIndex = col;
    }

    public void attack(){
        //
    }

    public void loseHealth(int att){
        health -= att;
    }

    /* Finds where the current skeleton is, removes it from its previous arraylist, and puts it in the next adjacent one */
    public void move(){
        //TODO: Add interactions with farmers
        int curPos = -1;
        
        for(int index = 0; index < Main.field[rowIndex][colIndex].size(); index++){
            if(Main.field[rowIndex][colIndex].get(index).getId().equals(this.getId())){
                curPos = index;
            }
        }
        if(curPos != -1){
            Main.field[rowIndex][colIndex-1].add(Main.field[rowIndex][colIndex].remove(curPos));
            colIndex--;
        } else {
            System.out.println("Something went wrong!");
        }
        
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

    public void run() {
        while (true) { 
            try {
                Thread.sleep((int)(3000 * (speed*1.0/100)));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            move();  
        }
    }
}