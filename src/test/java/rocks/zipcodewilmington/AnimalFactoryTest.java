package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void createDogTest() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();

        //WHen
        Dog dog = AnimalFactory.createDog(name, birthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);

    }

    @Test
    public void createCatTest() {
        //Given
        String name = "Zula";
        Date birthDate = new Date();

        //WHen
        Cat cat = AnimalFactory.createCat(name, birthDate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);

    }


    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
