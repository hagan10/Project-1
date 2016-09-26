public class plantetaryWeight 
{
    public static void main (String[] args)
    {
        // GLOBAL VARIABLES
        // Gravity in m/s^2
        double earthGravity = 9.81; 
        // Declare planet variables 
        String planet;
       
        // Tell what the program does 
        System.out.println("This program will calculate your weight on Mercury, Venus, or Mars.");
        
        // Ask user to input weight in pounds
        System.out.print("Please enter your weight as a whole number in pounds: ");
        double earthWeight = StdIn.readDouble(); 
        
        // Error check earthWeight
        if (earthWeight < 1 || earthWeight > 500)
        {
            System.out.println("Weight must be between 1 and 500.");
            // reprompt the user  
        }
        
        // Ask user to input which planet they would like to calculate
        System.out.println("Choose a planet. Please type:\n1 for Mercury \n2 for Venus \n3 for Mars"); 
        
        // Store user input in variable 
        int planetChoice;
        planetChoice = StdIn.readInt();
        
        // Error check what user typed in
        if (planetChoice < 1 || planetChoice > 3) 
        {
            System.out.println("Please choose 1, 2, or 3."); 
            // somehow reprompt them 
        }
        
        // if the user typed 1, output Mercury 
        if (planetChoice == 1)
        {
            planet = "Mercury";
            double mercuryGravity = 3.7;
            double gravityRatio = mercuryGravity / earthGravity; 
            double mercuryWeight = earthWeight * gravityRatio;
            System.out.println("You would weigh "+ mercuryWeight + " pounds on " + planet + ".");
            double difference = earthWeight - mercuryWeight; 
            System.out.print("That's a difference of " + difference + " pounds.");
        }
        // if the user typed 2, output Venus 
        else if (planetChoice == 2)
        {
            planet = "Venus";
            double venusGravity = 8.87;
            double gravityRatio = venusGravity / earthGravity; 
            double venusWeight = earthWeight * gravityRatio;
            System.out.println("You would weigh "+ venusWeight + " pounds on " + planet + ".");
            double difference = earthWeight - venusWeight; 
            System.out.print("That's a difference of " + difference + " pounds.");
            
        }
        // if the user typed 3, output Mars 
        else if (planetChoice == 3)
        {
            planet = "Mars";
            double marsGravity = 3.71;
            double gravityRatio = marsGravity / earthGravity; 
            double marsWeight = earthWeight * gravityRatio;
            System.out.println("You would weigh "+ marsWeight + " pounds on " + planet + ".");
            double difference = earthWeight - marsWeight; 
            System.out.print("That's a difference of " + difference + " pounds.");
        }
    }
}