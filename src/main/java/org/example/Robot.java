package org.example;

public class Robot {

    //Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    //Constructor
    public Robot() {
        this.name = "Robby";
        this.weaponName = "Sword";
        this.weaponPower = 50;
    }
    //Methods (CAD DO)
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weaponName + " for " +
                this.weaponPower + " damage!");
    }
}


