public class Lasagna {

   //return the expected oven time in minutes (always 40 mins)
    public int expectedMinutesInOven() {
        return 40;
    }

    //return how long does lasagna needs to be in oven 
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    //returns the preparation time based on number of layers each layer takes two min
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2; 
    }

    //return the total time spent prep + oven time 
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }

}