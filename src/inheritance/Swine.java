package inheritance;

public class Swine extends Animal {

    private String name;

    protected Swine() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {

        System.out.println("Swine noises");
    }
}
