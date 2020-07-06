package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest( ){

        //given
         Dog newCat = new Dog(" " , new Date(), 3);
        
         //when
        DogHouse.add(newCat);

        Integer expectedValue = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        //then
        Assert.assertEquals(expectedValue, actual);
    }
    
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntegerIdTest( ){

        //given
        Dog newCat = new Dog (" ", new Date(), 3);
        DogHouse.add(newCat);

        //when 
        DogHouse.remove(3);
        Integer expectedValue= 0;
        Integer actual = DogHouse.getNumberOfDogs();

        //then
        Assert.assertEquals(expectedValue, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest( ){

        //given
        Dog newDog = new Dog(" ", new Date(), 3);
        DogHouse.add(newDog);

        //when 
        DogHouse.remove(newDog);
        Integer expectedValue= 0;
        Integer actual = DogHouse.getNumberOfDogs();

        //then
        Assert.assertEquals(expectedValue, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogIdTest( ){
        //given
        Dog newCat = new Dog (" ", new Date(), 3);
        DogHouse.add(newCat);


        //when 
        Dog expectedValue = newCat;
        Dog actual = DogHouse.getDogById(3);

        //then
        Assert.assertEquals(expectedValue, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberofDogsTest() {

        //given
        Dog newCat = new Dog (" ", new Date(), 3);
        DogHouse.add(newCat);

        //when 
        Integer expectedValue= 1;
        Integer actual= DogHouse.getNumberOfDogs();


        //then
        Assert.assertEquals(expectedValue, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
