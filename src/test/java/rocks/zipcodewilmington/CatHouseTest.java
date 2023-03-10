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
public class CatHouseTest {

    @Test
    public void getNumberOfCatsTest() {
        CatHouse.clear();
        int expectedNumberOfCats = 1;

        CatHouse.add(AnimalFactory.createCat("Chuck", new Date()));
        int actualNumberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCats,actualNumberOfCats);
    }
    @Test
    public void addTest() {
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat("Chilli", new Date());
        String actualCatName = cat.getName();

        Assert.assertTrue(!actualCatName.equals(""));

    }

    @Test
    public void removeByNameTest() {
        CatHouse.clear();
        int expectedNumberOfCat = 0;

        Cat cat = AnimalFactory.createCat("Lulu", new Date());
        CatHouse.add(cat);

        CatHouse.remove(cat);
        int actualNumberOfCat = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCat,actualNumberOfCat);
    }

    @Test
    public void removeTest() {
        CatHouse.clear();
        int expectedNumberOfCat = 0;

        Cat cat = AnimalFactory.createCat("Lulu", new Date());
        int id = 0;
        CatHouse.add(cat);

        CatHouse.remove(id);
        int actualNumberOfCat = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCat,actualNumberOfCat);
    }

    @Test
    public void getCatByIdTest() {
        CatHouse.clear();
        Cat expectedCat = AnimalFactory.createCat("Lala", new Date());
        int id = expectedCat.getId();
        CatHouse.add(expectedCat);

        Cat actualCat = CatHouse.getCatById(id);
        Assert.assertTrue(expectedCat.equals(actualCat));
    }




    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
