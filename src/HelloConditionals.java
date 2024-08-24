import java.util.Objects;

public class HelloConditionals {
    public static void main(String[] args) {
        System.out.println("A phrase");
        System.out.println("Another phrase");
        System.out.println("Yet Another phrase");
//        boolean showSecretMessage = false;
//        if (showSecretMessage == true){
//            System.out.println("Welcome Agent IH");
//        }
//        weeklyBalance > 50 -> true or false
        double weeklyBalance = -10;
        if (weeklyBalance > 50) {
            System.out.println("Let's go to the Water Park");
        } else if (weeklyBalance < 50 && weeklyBalance > 0) {
//            and operator is && -> both condition bust be true
//            or operator is || -> one of the condition must be true
            System.out.println("Let's stay home and order a pizza");
        } else if (weeklyBalance <= 0 ) {
            System.out.println("You should go join a bootcamp and find a new job");
        }
//        else {
//            System.out.println("You can stay home with pizza or go to the Water park");
//        }

        String todayWeather = "rainy";
        if (todayWeather.equals("sunny") || todayWeather.equals("almost sunny, but very hot")){
            System.out.println("Let's go to the beach");
        } else if(todayWeather.equals("rainy")) {
            System.out.println("Stay home and prepare some tea");
        } else {
            System.out.println("dont e lazy, open your window and look outside");
        }


//        I have a number, I want to know if its even or odd. How?
//        % -> if we take a number and we divide it by another it returns the remainder


//        Simple algorithm to check if number is odd or even
        int x = -34256;
        if (x % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


        String password = "1234";
        String userInput = "124";
        if (userInput.equals(password)){
            System.out.println("Welcome, you are in");
        } else {
            System.out.println("Access denied");
        }

        int y = 4;

        if (y != 4) {
            System.out.println("it's the number! anything biut that bad number: " + y);
        }


        if (y == 4) {
            System.out.println("number right" + y);
        }


//        Integer item = null;
//        if (!Objects.nonNull(item)){
//            System.out.println("Object is null");
//        }

        int month = 1;
        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Month is not valid");
        }
        switch (month) {
            case 1 -> {
                System.out.println("January");
            }
            case 2 -> {
                System.out.println("February");
            }
            default -> {
                System.out.println("Month is not valid");
            }
        }


        String result = 50 % 2 == 0 ? "even" : "odd";
        System.out.println(result);

    }
}
