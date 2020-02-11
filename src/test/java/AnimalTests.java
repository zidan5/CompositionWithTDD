import org.junit.Assert;
import org.junit.Test;

public class AnimalTests{

    Dog d1 = new Dog();
    Cat c1 = new Cat();

    @Test
    public void TestDogSound(){
       Assert.assertEquals(d1.sound(),"Barks");
    }
    @Test
    public void TestDogEats(){
        Assert.assertEquals(d1.eats(), "Food");
    }
    @Test
    public  void TestCatSound(){
        Assert.assertEquals(c1.sound(),"Meows");
    }
    @Test
    public void TestCatEats(){
        Assert.assertEquals(c1.eats(),"Food");
    }

}
