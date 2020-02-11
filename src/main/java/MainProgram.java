public class MainProgram {
    public static  void main(String Args[]){

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        home.makeAllSounds(); // This prints Nothing since there are no Pet's added

        home.AdoptPet(dog1); // Adding the first Dog
        home.makeAllSounds(); // Printing the overwritten method

        System.out.println();

        home.AdoptPet(cat); // Adding the second dog
        home.makeAllSounds();

        System.out.println();

        home.AdoptPet(dog2);

        home.makeAllSounds();
    }
}
