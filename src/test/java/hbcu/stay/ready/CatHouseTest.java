package hbcu.stay.ready;
import java.util.Date;
import hbcu.stay.ready.animals.Cat;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    
    @Test
    public void addCatTest( ){

        //given
         Cat newCat = new Cat(" " , new Date(), 3);
        
         //when
        CatHouse.add(newCat);

        Integer expectedValue = 1;
        Integer actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expectedValue, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntegerIdTest( ){

        //given
        Cat newCat = new Cat (" ", new Date(), 3);
        CatHouse.add(newCat);

        //when 
        CatHouse.remove(3);
        Integer expectedValue= 0;
        Integer actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expectedValue, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest( ){

        //given
        Cat newCat = new Cat (" ", new Date(), 3);
        CatHouse.add(newCat);

        //when 
        CatHouse.remove(newCat);
        Integer expectedValue= 0;
        Integer actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(expectedValue, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatIdTest( ){
        //given
        Cat newCat = new Cat (" ", new Date(), 3);
        CatHouse.add(newCat);


        //when 
        Cat expectedValue = newCat;
        Cat actual = CatHouse.getCatById(3);

        //then
        Assert.assertEquals(expectedValue, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberofCatsTest() {

        //given
        Cat newCat = new Cat (" ", new Date(), 3);
        CatHouse.add(newCat);

        //when 
        Integer expectedValue= 1;
        Integer actual= CatHouse.getNumberOfCats();


        //then
        Assert.assertEquals(expectedValue, actual);
    }
}
