



/*
  # Instructions  :
  In this exercise you're going to write some code to help you cook a brilliant lasagna from your favorite cooking book.

  You have four tasks, all related to the time spent cooking the lasagna.

  1. Define the expected oven time in minutes
  Define the expectedMinutesInOven() method that does not take any parameters and returns how many minutes the lasagna should be in the oven. 
  According to the cooking book, the expected oven time in minutes is 40:

  Lasagna lasagna = new Lasagna();
  lasagna.expectedMinutesInOven();
  // => 40
  
  2. Calculate the remaining oven time in minutes
  Define the remainingMinutesInOven() method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task.

  Lasagna lasagna = new Lasagna();
  lasagna.remainingMinutesInOven(30);
  // => 10
  
  3. Calculate the preparation time in minutes
  Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare.

  Lasagna lasagna = new Lasagna();
  lasagna.preparationTimeInMinutes(2);
  // => 4
  
  4. Calculate the total working time in minutes
  Define the totalTimeInMinutes() method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment.

  Lasagna lasagna = new Lasagna();
  lasagna.totalTimeInMinutes(3, 20);
  // => 26
  
  31-March-2023
*/


public class Lasagna {
    private final int COOKING_TIME_IN_MINS = 40; // cooking time is 40 minutes
    private final int MINS_PREP_PER_LAYER = 2; // each layer takes 2 minutes to cook
    
    // Returns expected length of 40 minutes
    public int expectedMinutesInOven(){
        return COOKING_TIME_IN_MINS;
    }
    // Returns minutes remaining in oven, based on expected minutes
    public int remainingMinutesInOven(int minutesPassed){
        return this.expectedMinutesInOven() - minutesPassed;
    }
    // Returns number of minutes you have spent preparing the lasagna
    public int preparationTimeInMinutes(int numLayers){
        return MINS_PREP_PER_LAYER * numLayers;
    }
    // Returns the total time you have been making the lasagna
    public int totalTimeInMinutes(int numLayers, int minutesPassed){
        return this.preparationTimeInMinutes(numLayers) + minutesPassed;
    }
}
