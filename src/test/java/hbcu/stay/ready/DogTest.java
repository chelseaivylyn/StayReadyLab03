package hbcu.stay.ready;


import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;
import hbcu.stay.ready.animals.Animal;



public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
     @Test 
    public void dogTest(){
        // given
        Dog newDog = new Dog (" ", new Date(), 3);
        
        
        //when
        newDog.setName("Molly");
        String actual = newDog.getName();
        String expected = "Molly"; 


        //then

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `speak`
    @Test 
    public void speakTest(){
        //given
        Dog newCat = new Dog (" ", new Date(),3);

        //When
        newCat.speak( );
        String actual = newCat.speak();
        String expectedValue = "bark!";
        
        //then
        Assert.assertEquals(expectedValue, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test

    public void setBirthDateTest(){
        //given
        Date birthdate = new Date();
        Dog newDog = new Dog ("L",birthdate,3);

        //when
        newDog.setBirthDate(birthdate);
        Date actual = newDog.getBirthDate();
        Date expected =birthdate;
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest()
    {
        //Given 
        Food Dogfood = new Food();
        Dog  newDog= new Dog("pablo,", new Date(), 4);

        //When
        newDog.eat(Dogfood);
        Integer expected= 1;
        Integer actual = newDog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void integerTest (){

        //given
        Dog newDog = new Dog (" ", new Date(),3);


        //when
        Integer Id = newDog.getId();
        Integer expectedValue = 3;
        //then

        Assert.assertEquals(expectedValue, Id);


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test

    public void inheritanceTest1(){
    //given
     Dog newDog = new Dog (" ",new Date(),3);

    //when
    Boolean expectedValue = true;
    boolean actual = newDog instanceof Animal;
    //then 

    Assert.assertEquals(expectedValue, actual);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test

    public void inheritanceTest(){
    //given
     Dog newDog = new Dog (" ",new Date(),3);

    //when
    Boolean expectedValue = true;
    boolean actual = newDog instanceof Mammal;
    //then 

    Assert.assertEquals(expectedValue, actual);

    }
    
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
