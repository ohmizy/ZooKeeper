public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("the gorilla threw a banana");
        energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("Gorilla's satisfied");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("Gorilla has climbed tree");
        energyLevel -= 10;
    }
}
