import java.util.ArrayList;
import java.util.List;

public class Home {

    List<Animal> list = new ArrayList<>();

    public void AdoptPet(Animal animal) throws Exception{

        if(!list.contains( animal)){
            list.add(animal);
        }else
           throw new Exception("Object already exits..!!");
           // System.out.println("Object already exits");
        }

    public void makeAllSounds(){

         for(Animal animal : list){
             animal.sound();
         }
    }

}
