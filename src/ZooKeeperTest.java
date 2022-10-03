public class ZooKeeperTest {
    public static void main(String[] args) {
        Mammal bs = new Mammal();
        Gorilla gs = new Gorilla();
        Bat bats = new Bat();
        bs.displayEnergyLevel();
        gs.displayEnergyLevel();
        gs.throwSomething();
        gs.displayEnergyLevel();
        gs.climb();
        gs.eatBananas();
        int batEnergy = bats.displayEnergyLevel();
        System.out.println(batEnergy);
    }
}
