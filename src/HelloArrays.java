public class HelloArrays {



    public static void main(String[] args) {
        String name = "Salvatore";
//        String names = "Salva", "Paul", "Jane"; not possible in java

//        String, Long, Integer, String, Double
//        String, String, String
//        Double, Double, Double


        String[] names;
        String[] names2 = new String[3];
        String[] names3 = {"Salva", "Paul", "Jane"};

        System.out.println();

        System.out.println(names3[0]);
        System.out.println(names3.length);


        for (int i = 0; i < names3.length; i++) {
            System.out.println(names3[i]);
        }

        names3[1] = "Naruto";
        System.out.println("==================");
        for (int i = 0; i < names3.length; i++) {
            System.out.println(names3[i]);
        }

        for(String n : names3){
            System.out.println(n);
        }



    }
}
