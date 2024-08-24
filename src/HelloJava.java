public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Ironhack!");
        System.out.println("Welcome to the Java Bootcamp");

//        String box = "cable";
        String box = "kombucha";
//         bla bla bla caffe pizza

        System.out.println("The box contains: " + box);
//      sout
        int myAge = 35;
        System.out.println(myAge);
        int myFavNumber;

        myFavNumber = 13;

        System.out.println("My favourite number is " + myFavNumber);

        myAge = 36;
        System.out.println(myAge);
        boolean isJavaAwesome = true;
        boolean isJavaBoring = false;
        double margheritaPrice = 5.99;
        double espressoPrice = 0.99;
        String teacher = "Salvatore";
        String courseName = "Java Backend";
        Double rating = 4.9;
        char myInitial = 's';
//        long, float, short, byte

//        String, int, boolean, double, char

//        for variables and methods -> camel case: first letter lower-case then next word capitalized
//        we generally dont use snake case: course_name -> for constants we use COURSE_NAME
//        String CourseName = "Java 1010"

        int p1;

        int x = 1;
        int y = 3;
        int result = x + y;

        double z = 3;
        double t = 2;
        double result2 = z / t;
        System.out.println(result);
        System.out.println(result2);

        String pizzaName = "Ortolana";
        double pizzaPrice = 10.99;
        String pizzaDeliveryMan = "Antonio";
        boolean isPizzaGlutenFree = true;

        System.out.println("Menu");
        System.out.println(pizzaName + " - " + pizzaPrice + "is delivered for you by: "
                + pizzaDeliveryMan + " and if you ask if it's gluten free we say: " + isPizzaGlutenFree);



        pizzaName = "Tartufa";
        pizzaPrice = 14.99;
        pizzaDeliveryMan = "Antonio";
        isPizzaGlutenFree = false;


        System.out.println(pizzaName + " - " + pizzaPrice + "is delivered for you by: "
                + pizzaDeliveryMan + " and if you ask if it's gluten free we say: " + isPizzaGlutenFree);


        System.out.println("Integer MAX number stored is: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN number stored is: " + Integer.MIN_VALUE);
        System.out.println("Long MAX number stored is: " + Long.MAX_VALUE);
        System.out.println("Long MIN number stored is: " + Long.MIN_VALUE);
        System.out.println("Short MAX number stored is: " + Short.MAX_VALUE);
        System.out.println("Short MIN number stored is: " + Short.MIN_VALUE);
//        short s = 2;

    }
}