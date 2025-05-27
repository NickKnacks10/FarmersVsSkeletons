import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class LevelReader implements Runnable{
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
                    Skele ske = new BasicSkele();
                    int rowThing = Integer.parseInt(data.substring(5,6));
                    Main.field[rowThing][8].add(ske);
                    ske.setPosition(rowThing, 8);
                    Thread thr = new Thread(ske);
                    thr.start();
                    skeleCount++
                } else if(data.substring(0,3).equals("end")){
                    //TODO add a timer for the wave starting thing
                    if(data.substring(4,8).equals("wave")){
                        if(skeleCount <= maxSkeleCount/2){
                            //To add
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something goofed up.");
            e.printStackTrace();
        }
    }
}


