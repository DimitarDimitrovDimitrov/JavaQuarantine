package interfaceEx;

public class Main {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Woof woof = new Woof();
        woof.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
