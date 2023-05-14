public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("Age: " + myPet.Age);
        System.out.println("Weight: " + myPet.Weight);
    }
}