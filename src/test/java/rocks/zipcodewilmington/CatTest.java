package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

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

    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String expected = "Dave";
        //When
        cat.setName(expected);
        String actual = cat.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setBirthDateTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Date expected = new Date();
        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        //When
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int expected = 0;
        //When
        int actual = cat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected,actual);
    }

//    @Test
//    public void getIdTest() {
//        // Given
//        Cat cat = new Cat(null, null, null);
//        int expected = 11;
//        //When
//        int actual = ;
//        //Then
//        Assert.assertEquals(expected,actual);
//    }

    @Test
    public void animalInheritantTest() {
        // Given
        Cat cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritantTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }


}