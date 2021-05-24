package Repository;

import Model.Breeds;
import Model.Country;
import Resource.BreedFinderController;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@ActiveProfiles("test")
public class BreedfinderControllerTest {
    BreedFinderController breedFinderController;

    @Test
    public void testGetBreedInfo() {

        List<Country>  countryList = new ArrayList<>();
        Country country1 = new Country();
        country1.setCountry("America");
        country1.setCountry("Australia");
        countryList.add(country1);

        List<Breeds> breeds = new ArrayList<>();
        Breeds breeds1 = new Breeds();
        breeds1.setBreeds(countryList);
        breeds.add(breeds1);

        Assert.notEmpty(breedFinderController.getBreedInfo(breeds));
    }
}
