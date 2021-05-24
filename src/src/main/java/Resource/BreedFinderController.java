package src.main.java.Resource;
import Model.Breeds;
import Repository.BreedFinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/dog.ceo/api")
public class BreedFinderController {
    @Autowired
    private BreedFinderRepository breedFinderRepository;
    @GetMapping("/breeds/list/all")
    public List<Breeds> getBreedInfo(List<Breeds> breeds){
        List<Breeds> breedsList = null;
        breedsList = breedFinderRepository.findBreedInfo(breeds);
        return breedsList;

    }
}
