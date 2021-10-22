package food;

public class Main {

    public static void main(String[] args) {

       Food[] fridge = new Food[3];

        Food food1 = new Food("Meatballs");
        Food food2 = new Food("Salad");
        Food food3 = new Food("Potatoes");

    //    Food[] fridge = {food1,food2,food3}; Another way of initialising it


        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);

    }
}
