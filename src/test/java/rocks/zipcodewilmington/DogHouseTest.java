package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogsTest() {
        DogHouse.clear();
        int expectedNumberOfDogs = 1;

        DogHouse.add(AnimalFactory.createDog("Jimmy", new Date()));
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDogs,actualNumberOfDogs);
    }

    @Test
    public void addTest() {
        DogHouse.clear();;
        Dog dog = AnimalFactory.createDog("Chilli", new Date());
        String actualDogName = dog.getName();

        Assert.assertTrue(!actualDogName.equals(""));

    }

    @Test
    public void removeByNameTest() {
        DogHouse.clear();
        int expectedNumberOfDog = 0;

        Dog dog = AnimalFactory.createDog("Dave", new Date());
        DogHouse.add(dog);

        DogHouse.remove(dog);
        int actualNumberOfDog = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDog,actualNumberOfDog);
    }

    @Test
    public void removeTest() {
        DogHouse.clear();
        int expectedNumberOfDog = 0;

        Dog dog = AnimalFactory.createDog("Jake", new Date());
        int id = 0;
        DogHouse.add(dog);

        DogHouse.remove(id);
        int actualNumberOfDog = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDog,actualNumberOfDog);
    }

    @Test
    public void getDogByIdTest() {
        DogHouse.clear();
        Dog expectedDog = AnimalFactory.createDog("Lala", new Date());
        int id = expectedDog.getId();
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(id);
        Assert.assertTrue(expectedDog.equals(actualDog));
    }


}
