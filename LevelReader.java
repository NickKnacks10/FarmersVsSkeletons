import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelReader implements Runnable{
    
    static int skeleCount = 0;
    static int maxSkeleCount = 0;
    
    public void run(){
        levelRunner();
    }
    
    static void levelRunner(){
        try {
            File level = new File("Level1.txt");
            Scanner levelReader = new Scanner(level);
            
            while (levelReader.hasNextLine()) {
                String data = levelReader.nextLine();
                if(data.substring(0,1).equals("*")){
                    continue;
                } else if(data.substring(0,4).equals("cre")){
                    //Make this a custom method with the txt files starting with "create"?
                    createSkele(Integer.parseInt(data.substring(5,9)), data.substring(9,10));
                    //Check if this actually works
                    
                } else if(data.substring(0,3).equals("end")){
                    //Note: Can switch to System.nanoTime if needed
                    double savedTime = System.currentTimeMillis();
                    if(data.substring(4,8).equals("wave")){
                        double curTime = System.currentTimeMillis();
                        while(!(skeleCount <= maxSkeleCount/2 || curTime-savedTime >= 15000)){
                            try {
                                Thread.sleep(500);
                                curTime = System.currentTimeMillis();
                            } catch (Exception e) {
                                System.out.println("error: wave end timer failed");
                            }
                        }
                        maxSkeleCount = 0;
                        skeleCount = 0;
                    }
                }
            }
            System.out.println("LevelEnd");
        } catch (FileNotFoundException e) {
            System.out.println("Something goofed up.");
            e.printStackTrace();
        }
    }

    public static void createSkele(int identity, String rowId){
        Skele ske = null;
        try{
            switch(identity){
                case 1:
                    ske = new BasicSkele();
                    break;
                
                case 2:
                    ske = new LeatherSkele();
                    break;
                
                case 3:
                    ske = new IronSkele();
                    break;
                
            }
            int rowThing = Integer.parseInt(rowId);
            Main.field[rowThing][8].add(ske);
            ske.setPosition(rowThing, 8);
            Thread thr = new Thread(ske);
            thr.start();
            skeleCount++;
            maxSkeleCount++;
        } catch (Exception e){
            System.out.println("Skele creation failed");
        }
    }
}


