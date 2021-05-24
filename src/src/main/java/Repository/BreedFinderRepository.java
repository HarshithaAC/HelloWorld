package src.main.java.Repository;

import Model.Breeds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BreedFinderRepository {

    public List<Breeds> findBreedInfo(List<Breeds> breeds) {
        //Here we can iterate the given list and filter the list as per our requirement and return the data
        List<Breeds> result = null;
        for(Breeds b: breeds) {
            result.add(b);
        }
        return result;

    }
}
