package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Dave";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setNameTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        String expected = "Dave";
        //When
        dog.setName(expected);
        String actual = dog.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setBirthDateTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        Date expected = new Date();
        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        String expected = "bark!";
        //When
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        Food food = new Food();
        int expected = 0;
        //When
        int actual = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdTest() {
        // Given
        Dog dog = new Dog(null,null,11);
        int expected = 11;
        //When
        int actual = dog.getId();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void animalInheritantTest() {
        // Given
        Dog dog = new Dog(null,null,null);

        //Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritantTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }


}
