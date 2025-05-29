import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelReader implements Runnable{
    public void run(){
        levelRunner();
    }
    
    static void levelRunner(){
        try {
            File level = new File("Level1.txt");
            Scanner levelReader = new Scanner(level);
            int skeleCount = 0;
            int maxSkeleCount = 0;
            while (levelReader.hasNextLine()) {
                String data = levelReader.nextLine();
                if(data.substring(0,1).equals("*")){
                    continue;
                } else if(data.substring(0,4).equals("0001")){
                    //Make this a custom method with the txt files starting with "create"?
                    Skele ske = new BasicSkele();
                    int rowThing = Integer.parseInt(data.substring(5,6));
                    Main.field[rowThing][8].add(ske);
                    ske.setPosition(rowThing, 8);
                    Thread thr = new Thread(ske);
                    thr.start();
                    skeleCount++;
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
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something goofed up.");
            e.printStackTrace();
        }
    }

    public static void createSkele(int identity){

    }
}


