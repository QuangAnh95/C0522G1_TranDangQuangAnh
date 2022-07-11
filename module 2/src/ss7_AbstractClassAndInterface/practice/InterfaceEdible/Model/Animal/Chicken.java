package ss7_AbstractClassAndInterface.practice.InterfaceEdible.Model.Animal;

import ss7_AbstractClassAndInterface.practice.InterfaceEdible.Model.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck_cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
