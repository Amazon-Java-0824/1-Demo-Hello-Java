public class HelloStrings {


    public static void main(String[] args) {
        String bestAnimeEvah = "JoJutsu Kaisen";

        System.out.println(bestAnimeEvah);
        System.out.println(bestAnimeEvah.toUpperCase());
        System.out.println(bestAnimeEvah.toLowerCase());

        String boss = "   Gojo    ";
        boss= boss.trim();
        System.out.println("|" + boss);

        String greet = "Hello Java my old friend";
        String[] words = greet.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words[0].toUpperCase().trim());


        System.out.println(boss.charAt(0));

        System.out.println(greet.toLowerCase().contains("java"));




    }
}
