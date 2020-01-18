package animal;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalMain {

    @Autowired
    Breed breed;

    public static void main(String[] args) {

        Breed breed = new Breed();

        List<Dog> dogs = null;

        for (String breedType: breed.getBreedTypes()) {
            dogs.add(new Dog(14, "brown", breedType));
        }

        System.out.println("Total dog count is " + dogs.size());
    }
}
