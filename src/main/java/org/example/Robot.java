package org.example;

public class Robot {

    //Instance variables (HAS A)
    public String name;

    public Weapon weapon;

    //Constructor
    public Robot() {
        this.name = "Robby";
        this.weapon = new Weapon ("Sword", 50);
    }
    //Methods (CAD DO)
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " +
                this.weapon.power + " damage!");
    }
}


