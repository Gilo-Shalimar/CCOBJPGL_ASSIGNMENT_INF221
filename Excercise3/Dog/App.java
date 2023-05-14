public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Poogle myPet = new Poogle();

        myPet.bark();
        System.out.println("Weight: " + myPet.weight);
        System.out.println("Height: " + myPet.height);
    }
}