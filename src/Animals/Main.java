package Animals;

public class Main {

    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("газель", 3, "саванна",36, "растительность");
        Herbivores giraffe = new Herbivores("жираф", 5, "саванна",15, "растительность");
        Herbivores horse = new Herbivores("лошадь", 6, "степь",37, "сено");

        Predators gehenna = new Predators("гиена", 7, "саванна",29, "мясо");
        Predators tiger = new Predators("тигр", 4, "джунгли",34, "мясо");
        Predators bear = new Predators("медведь", 8, "лес",28, "мясо и рыба");

        Amphibians frog = new Amphibians("лягушка", 2 , "болото");
        Amphibians alreadyFreshwater = new Amphibians("уж пресноводный", 4 , "река");

        Flightless peacock = new Flightless("павлин", 4, "река", "ходьба");
        Flightless penguin = new Flightless("ингвин", 6, "ледник", "ходьба");
        Flightless dodoBird = new Flightless("птица додо", 8, "река", "ходьба");

        Flying seagull = new Flying("чайка", 4, "река", "летает");
        Flying albatross = new Flying("альбатрос", 5, "озеро", "летает");
        Flying falcon = new Flying("сокол", 6, "лес", "летает");

        System.out.println("#############");
        System.out.println(gazelle);
        gazelle.eat();
        gazelle.sleep();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("#############");
        System.out.println(gehenna);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println("#############");
        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        System.out.println("#############");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println("#############");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println("#############");
    }
}