import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
     
     private static Random generator;
    public static void main(String args[])
    {
        System.out.println("Welcome to Fish Simulator");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        generator = new Random();
       //int randNum = generator.nextInt(10);

        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(500, 700); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
      
            
        AquaFish Bob = new AquaFish(aqua, getColor());
        aqua.add(Bob);
        
    
   
    
        AquaFish Nemo = new AquaFish(aqua, getColor());
        aqua.add(Nemo);
    
        AquaFish Girl = new AquaFish(aqua, getColor());
        aqua.add(Girl);
        
        
        AquaFish Slushi = new AquaFish(aqua, getColor());
        aqua.add(Slushi);
        
        AquaFish Boy = new AquaFish(aqua, getColor());
        aqua.add(Boy);
        
        AquaFish Hah = new AquaFish(aqua, getColor());
        aqua.add(Hah);

        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, true);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.
        

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
       
        
        
       int b = userInterface.getNumberOfSteps();
        
        for (int i=1; i<=b; i++){
                int change = generator.nextInt(4);
                if(change==1){
                    Nemo.changeDir();
                    Slushi.changeDir();
                }
                else if(change == 2){
                    Bob.changeDir();
                    Girl.changeDir();
                    Boy.changeDir();
                    Hah.changeDir();
                }
                Slushi.moveForward();
                if (Slushi.atWall()){
                    Slushi.changeDir();
                }
            
                Nemo.moveForward();
                if(Nemo.atWall()){
                    Nemo.changeDir();
                }
        
                Bob.moveForward();
                if(Bob.atWall()){
                    Bob.changeDir();
                }
                Boy.moveForward();
                if(Boy.atWall()){
                    Boy.changeDir();
                }
                Girl.moveForward();
                if(Girl.atWall()){
                    Girl.changeDir();
                }
                Hah.moveForward();
                if(Hah.atWall()){
                    Hah.changeDir();
                }

                



                userInterface.showAquarium();
    
}

        // WRAP UP.

        // Remind user how to quit application.
        userInterface.println ("Close GUI display window to quit.");

    }//end main
    public static Color getColor(){
        int randNum = generator.nextInt(6);
        if (randNum == 0){
            return Color.RED;
        }
        else if (randNum == 1){
            return Color.BLUE;
        }
        else if (randNum == 2){
            return Color.GREEN;
        }
        else if (randNum == 3){
            return Color.YELLOW;
        }
        else if (randNum == 4){
            return Color.MAGENTA;
        }
        else {
            return Color.ORANGE;
        }
        

}
}//end class
