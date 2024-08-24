public class HelloLoops {
    public static void main(String[] args) throws InterruptedException {


        int bottleOfWaterInMl = 1500;
        int glassMaxCapacityMl = 250;
        int actualWaterInGlassMl = 0;
        System.out.println("We are thirsty");

        int i = 0;
        while (i < 10) {

            while (actualWaterInGlassMl < glassMaxCapacityMl) {
                int waterPortionInMl = 50;
                if (bottleOfWaterInMl >= waterPortionInMl) {
                    actualWaterInGlassMl += waterPortionInMl;
                    bottleOfWaterInMl -= waterPortionInMl;

                    System.out.println("We added more water. Now water in the glass is: " + actualWaterInGlassMl + " ml");
                    System.out.println("Water left in the bottle: " + bottleOfWaterInMl + " ml");
                } else {
                    System.out.println("No more water in the bottle");
                    break;
                }
            }

            if (actualWaterInGlassMl == glassMaxCapacityMl) {
                System.out.println("Now we can drink. Water glass number: " + (i + 1));
                actualWaterInGlassMl = 0;
                i++;
            } else {
                System.out.println("Not enough water to fill the glass. We only filled " + actualWaterInGlassMl + " ml");
                break;
            }
        }

        System.out.println("We drank " + i + " glasses of water.");


//        for (int y = 10; y >= 0; y--){
//            System.out.println("Time is " + y);
//            Thread.sleep(1000);
//        }

        int z = 5;
        do {
            System.out.println("Something");

//            z = z - 1; // it's ugly -> no need to use it ( but is very explicit)
//            z -= 1; // this is better and it's flexible -> we can use it also like this z -= 2;
            z--; // this is the preferred options but only works with - 1 or + 1
//            --z; this work at a different time. careful
        } while(z > 0);


//        starting state
//        while ( condition if state something)
//        some code
//        something that modify the state towards a condition where the while stops -> the condition return false
    }
}
