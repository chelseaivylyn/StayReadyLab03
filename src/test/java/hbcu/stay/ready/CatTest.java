package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;
import hbcu.stay.ready.animals.Animal;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`


    @Test
    public void setNameTest( ){

        //given
        Cat newCat = new Cat(" ", new Date(), 3);

        //when
         newCat. setName("pablo");
         String actual =newCat.getName();
         
         String expectedValue = "pablo";


        //then
         
        Assert.assertEquals(expectedValue, actual);

    }



    // TODO - Create tests for `speak`

    @Test 
    public void speakTest(){
        //given
        Cat newCat = new Cat (" ", new Date(),3);

        //When
        newCat.speak( );
        String actual = newCat.speak();
        String expectedValue = "meow!";
        
        //then
        Assert.assertEquals(expectedValue, actual);

    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test

    public void setBirthDateTest(){
        //given
        Date birthdate = new Date();
        Cat newCat = new Cat ("L",birthdate,3);

        //when
        newCat.setBirthDate(birthdate);
        Date actual = newCat.getBirthDate();
        Date expected =birthdate;
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest()
    {
        //Given 
        Food catfood = new Food();
        Cat  newCat= new Cat("Giggles,", new Date(), 4);

        //When
        newCat.eat(catfood);
        Integer expected= 1;
        Integer actual = newCat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
        @Test
        public void integerTest (){

            //given
            Cat newCat = new Cat (" ", new Date(),3);


            //when
            Integer Id = newCat.getId();
            Integer expectedValue = 3;
            //then

            Assert.assertEquals(expectedValue, Id);


        }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword

    @Test

    public void inheritanceTest(){
    //given
     Cat newCat = new Cat (" ",new Date(),3);

    //when
    Boolean expectedValue = true;
    boolean actual = newCat instanceof Animal;

    //then 

    Assert.assertEquals(expectedValue, actual);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
   //then 

   
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
