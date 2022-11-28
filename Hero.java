import java.util.Scanner;
import java.util.ArrayList;

public class Hero 
{
    public int damage;
    public int health;
    public int dexterity;
    public String action;
    Scanner in = new Scanner(System.in);
    public double x;
    public double y;
    public int prob;
    public int probH;
    public int probM;
    public int r;
    public int c;
    public int maxHealth;

    // constructor
    public Hero()
    {
        double x = Math.random();
        this.damage = (int) (6 * x) + 1;
        double y = Math.random();
        this.health = (int) (11 * y) + 10;
        this.maxHealth = this.health;
        double z = Math.random();
        this.dexterity = (int) (6 * z) + 3;
    }

    public void battleWizard(Wizard wizard, int row, int column, ArrayList<String> inventory) 
    {
        System.out.println("Your health: " + this.health);
        System.out.println("There's a wizard! Type a for attack, d for dodge, or r for run.");
        this.action = in.next();
        while (this.health > 0 && wizard.health > 0) {
            if (this.action.equals("a")) {
                x = Math.random();
                probM = (int) (10 * x) + 1;
                if (probM <= 3) {
                    System.out.println("The wizard has dodged.");
                    wizard.health -= 0.5 * this.damage;
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                } else {
                    System.out.println("You've damaged the wizard, but the wizard has also damaged you!");
                    if (inventory.contains("Shield"))  {
                        this.health = this.health - wizard.damage + 1;
                        wizard.health -= this.damage;
                    } else {
                        this.health -= wizard.damage;
                        wizard.health -= this.damage;
                    }
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                }
            } else if (this.action.equals("d")) {
                x = Math.random();
                probH = ((int) (10 * x) + 1);
                y = Math.random();
                probM = (int) (10 * x) + 1;
                if (probH/10.0 <= .1 * this.dexterity) {
                    if (probM <= 3) {
                        System.out.println("You and the wizard have both dodged.");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                    else {
                        System.out.println("You've dodged the monster!");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                } else {
                    if (probM <= 3) {
                        System.out.println("You failed to dodge, but the wizard has also dodged.");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    } else { 
                        System.out.println("You failed to dodge! The wizard attacked you.");
                        if (inventory.contains("Shield"))
                            this.health = this.health - wizard.damage + 1;
                        else
                            this.health -= wizard.damage;
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                }
            } else if (this.action.equals("r")) {
                x = Math.random();
                probH = ((int) (10 * x) + 1);
                y = Math.random();
                probM = (int) (10 * x) + 1;
                if (probH/10.0 <= (.1 * this.dexterity)) {
                    System.out.println("You've successfully escaped the wizard!");
                    row = 1;
                    column = 1;
                    this.r = returnRow(row);
                    this.c = returnCol(column);
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                    return;
                } else {
                    System.out.println("You were unsuccessful in running away! Stay and fight!");
                    if (probM <= 3) {
                        System.out.println("The wizard has dodged.");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    } else {
                        System.out.println("The wizard has damaged you!");
                        if (inventory.contains("Shield"))  {
                            this.health = this.health - wizard.damage + 1;
                        } else {
                            this.health -= wizard.damage;
                        }
                        if (inventory.contains("Potion")) {
                            if (health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                }
            }
            System.out.println("Type a for attack, d for dodge, or r for run.");
            this.action = in.next();
        }
        if (this.health <= 0) {
            System.out.println("You've died.");
            return;
        }
        if (wizard.health <= 0) {
            System.out.println("You've defeated the wizard!");
            return;
        }
    }
    public void battleMonster(Monster monster, int row, int column, String dir, ArrayList<String> inventory) 
    {
        System.out.println("Your health: " + this.health);
        System.out.println("There's a monster! Type a for attack, d for dodge, or r for run.");
        this.action = in.next();
        while (this.health > 0 && monster.health > 0) {
            if (this.action.equals("a")) {
                x = Math.random();
                probM = (int) (10 * x) + 1;
                if (probM <= 3) {
                    System.out.println("The monster has dodged.");
                    monster.health -= 0.5 * this.damage;
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                } else {
                    System.out.println("You've damaged the monster, but the monster has also damaged you!");
                    if (inventory.contains("Shield"))  {
                        this.health = this.health - monster.damage + 1;
                        monster.health -= this.damage;
                    } else {
                        this.health -= monster.damage;
                        monster.health -= this.damage;
                    }
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                }
            } else if (this.action.equals("d")) {
                x = Math.random();
                probH = ((int) (10 * x) + 1);
                y = Math.random();
                probM = (int) (10 * x) + 1;
                if (probH/10.0 <= .1 * this.dexterity) {
                    if (probM <= 3) {
                        System.out.println("You and the monster have both dodged.");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                    else {
                        System.out.println("You've dodged the monster!");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                } else {
                    if (probM <= 3) {
                        System.out.println("You failed to dodge, but the monster has also dodged.");
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    } else { 
                        System.out.println("You failed to dodge! The monster attacked you.");
                        if (inventory.contains("Shield"))
                            this.health = this.health - monster.damage + 1;
                        else
                            this.health -= monster.damage;
                        if (inventory.contains("Potion")) {
                            if (this.health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                }
            } else if (this.action.equals("r")) {
                x = Math.random();
                probH = ((int) (10 * x) + 1);
                if (probH/10.0 <= (.1 * this.dexterity)) {
                    System.out.println("You've successfully escaped the monster!");
                    x = Math.random();
                    prob = (int) (100 * x) + 1;
                    if (prob <= 25) {
                        if (row == 3 && column == 1) {
                            row -= 1;
                            column += 1;
                        } else {
                            row -= 1;
                            column -= 1;
                        }
                    } else if (prob <= 50) {
                        column += 1; 
                    } else if (prob <= 75) {
                        column -= 1;
                    } else {
                        if (row == 1 && column == 1) {
                            row += 1;
                            column += 1;
                        } else {
                            row += 1;
                            column -= 1;
                        }
                    }
                    if (inventory.contains("Potion")) {
                        if (this.health < this.maxHealth)
                            this.health += 1;
                    }
                    this.r = returnRow(row);
                    this.c = returnCol(column);
                    return;
                } else {
                    y = Math.random();
                    probM = (int) (10 * x) + 1;
                    System.out.println("You were unsuccessful in running away!");
                    if (probM <= 3) {
                        System.out.println("The monster dodged.");
                        if (inventory.contains("Potion")) {
                            if (health < this.maxHealth)
                                this.health += 1;
                        }
                    } else {
                        System.out.println("The monster has damaged you!");
                        if (inventory.contains("Shield"))  {
                            this.health = this.health - monster.damage + 1;
                        } else {
                            this.health -= monster.damage;
                        }
                        if (inventory.contains("Potion")) {
                            if (health < this.maxHealth)
                                this.health += 1;
                        }
                    }
                }
            }
            System.out.println("Type a for attack, d for dodge, or r for run.");
            this.action = in.next();
        }
        if (this.health <= 0) {
            System.out.println("You've died.");
            return;
        }
        if (monster.health <= 0) {
            System.out.println("You've defeated the monster!");
            System.out.println("Your inventory contains:");
            for (int i = 0; i < inventory.size(); i++) 
                System.out.println(inventory.get(i));
            System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
            System.out.println("Type no if you'd like to keep the current inventory.");
            this.action = in.next();
            for (int i = 0; i < inventory.size(); i++) {
                if (this.action.equals(inventory.get(i))) {
                    inventory.remove(i);
                    if (this.action.equals("Ring"))
                        this.dexterity -= 1;
                }
            }
            System.out.println("Type n or e or s or w to go north, east, south, or west.");
            dir = in.next();
            if (dir.equals("n")) {
                if (row == 3 && column == 1) {
                    row -= 1;
                    column += 1;
                } else {
                    row -= 1;
                    column -= 1;
                }
            } else if (dir.equals("e")) {
                column += 1; 
            } else if (dir.equals("w")) {
                column -= 1;
            } else {
                if (row == 1 && column == 1) {
                    row += 1;
                    column += 1;
                } else {
                    row += 1;
                    column -= 1;
                }
            }
            this.r = returnRow(row);
            this.c = returnCol(column);
            return;
        }
    }
    public int returnRow(int row) {
        return row;
    }
    public int returnCol(int column) {
        return column;
    }
}