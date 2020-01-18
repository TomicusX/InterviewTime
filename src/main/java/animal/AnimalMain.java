package animal;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalMain {

    @Autowired
    Breed breed;

    public static void main(String[] args) {

        List<Breed> breeds = new ArrayList<>();

        List<Dog> dogs = null;

        for (Breed breed: breeds) {
            dogs.add(new Dog(14, "brown", breed));
        }

        System.out.println("Total dog count is " + dogs.size());
    }
}
