package hbcu.stay.ready;

import java.util.Date;
import hbcu.stay.ready.animals.Cat;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest( ){
        //given
         Date birthdate = new Date();
        
         String name = "pablo";
         Dog dog = AnimalFactory.createDog(name, birthdate);



        //when 
        String actual = dog.getName();
        Date secondactual = dog.getBirthDate();
        //then
        Assert.assertEquals(name, actual);
        Assert.assertEquals(birthdate, secondactual);



    }



    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    public void createCatTest( ){
        //given
         Date birthdate = new Date();
        
         String name = "missye";
         Cat cat = AnimalFactory.createCat(name, birthdate);



        //when 
        String actual = cat.getName();
        Date secondactual = cat.getBirthDate();
        //then
        Assert.assertEquals(name, actual);
        Assert.assertEquals(birthdate, secondactual);
    }
}
