import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class LevelReader implements Runnable{
    static void levelRunner(){
        try {
            File level = new File("Level1.txt");
            Scanner levelReader = new Scanner(level);
            while (levelReader.hasNextLine()) {
                String data = levelReader.nextLine();
                if(data.substring(0,1).equals("*")){
                    continue;
                }
                if(data.substring(0,4).equals("0001")){
                    Skele ske = new BasicSkele();
                    Main.field[Integer.parseInt(data.substring(5,6))][8].add(ske);
                    Thread thr = new Thread(ske);
                    thr.start();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something goofed up.");
            e.printStackTrace();
        }
    }
}


