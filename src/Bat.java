public class Bat extends Mammal{
    public int energyLevel = 300;

    public int displayEnergyLevel(){
        System.out.println(energyLevel);
        return this.energyLevel;
    }
    public void fly(){
        System.out.println("Sound of bat taking off");
        energyLevel -= 50;
    }
    public void eatHuman(){
        System.out.println("so well... never mind");
        energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("Sound of town on fire");
        energyLevel -= 100;
    }
}
