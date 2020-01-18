package animal;

import java.util.ArrayList;
import java.util.List;

public class Breed {
    List<String> breedTypes = new ArrayList<>();

    public void initBreedTypes() {
        breedTypes.add("boxer");
        breedTypes.add("pit bull");
        breedTypes.add("corgi");
        breedTypes.add("lab");
    }

    List<String> getBreedTypes() {
        return breedTypes;
    }

}
