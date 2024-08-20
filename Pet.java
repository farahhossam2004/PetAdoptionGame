class Pet {
    private String name;
    private int hungerLevel;
    private int happinessLevel;


    public Pet() {
        this.name = "";
        this.hungerLevel = 50;
        this.happinessLevel = 50;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void feedPet() {
        if (hungerLevel < 90) {
            hungerLevel += 10;
            happinessLevel -= 10;
            System.out.println(name + " has been fed. Hunger level is now " + hungerLevel + ".");
        } else {
            System.out.println(name + " is full and cannot eat more.");
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void playWithPet() {
        if (happinessLevel < 90) {
            happinessLevel += 10;
            hungerLevel -=20;
            System.out.println(name + " played and is happier now :)");
        } else {
            System.out.println(name + " is already very happy!");
        }
    }
}