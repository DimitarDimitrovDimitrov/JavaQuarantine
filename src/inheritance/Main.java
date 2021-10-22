package inheritance;

public class Main {

    public static void main(String[] args) {

        Possum possum = new Possum();

        Swine swine = new Swine();

        possum.makeNoise();

        swine.makeNoise();

        swine.setName("swine swine");
        System.out.println(swine.getName());

        possum.setName("Possum Possum");
        System.out.println(possum.getName());

    }
}
