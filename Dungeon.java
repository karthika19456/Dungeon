import java.util.Scanner;
import java.util.ArrayList;

public class Dungeon 
{
    public static int row;
    public static int column;
    public static String dir;
    public static void shuffleAccessories(ArrayList<String> accessory, String[][] acquire)
    {
        double x = Math.random();
        int prob = (int) (100 * x) + 1;
        if (prob <= 25) {
            acquire[1][0] = accessory.get(0);
            accessory.remove(0);
            x = Math.random();
            prob = (int) (99 * x) + 1;
            if (prob <= 33) {
                acquire[1][2] = accessory.get(0);
                accessory.remove(0);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else if (prob <= 66) {
                acquire[1][2] = accessory.get(1);
                accessory.remove(1);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else {
                acquire[1][2] = accessory.get(2);
                accessory.remove(2);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            }
        }
        else if (prob <= 50) {
            acquire[1][0] = accessory.get(1);
            accessory.remove(1);
            x = Math.random();
            prob = (int) (99 * x) + 1;
            if (prob <= 33) {
                acquire[1][2] = accessory.get(0);
                accessory.remove(0);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else if (prob <= 66) {
                acquire[1][2] = accessory.get(1);
                accessory.remove(1);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else {
                acquire[1][2] = accessory.get(2);
                accessory.remove(2);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            }
        }
        else if (prob <= 75) {
            acquire[1][0] = accessory.get(2);
            accessory.remove(2);
            x = Math.random();
            prob = (int) (99 * x) + 1;
            if (prob <= 33) {
                acquire[1][2] = accessory.get(0);
                accessory.remove(0);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else if (prob <= 66) {
                acquire[1][2] = accessory.get(1);
                accessory.remove(1);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else {
                acquire[1][2] = accessory.get(2);
                accessory.remove(2);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            }
        }
        else {
            acquire[1][0] = accessory.get(3);
            accessory.remove(3);
            x = Math.random();
            prob = (int) (99 * x) + 1;
            if (prob <= 33) {
                acquire[1][2] = accessory.get(0);
                accessory.remove(0);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else if (prob <= 66) {
                acquire[1][2] = accessory.get(1);
                accessory.remove(1);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            } else {
                acquire[1][2] = accessory.get(2);
                accessory.remove(2);
                x = Math.random();
                prob = (int) (10 * x) + 1;
                if (prob <= 5) {
                    acquire[3][0] = accessory.get(0);
                    acquire[3][2] = accessory.get(1);
                } else {
                    acquire[3][0] = accessory.get(1);
                    acquire[3][2] = accessory.get(0);
                }
            }
        }
        x = Math.random();
        prob = (int) (10 * x) + 1;
        if (prob <= 5) {
            acquire[2][0] = "Sword";
            acquire[2][4] = "Flamethrower";
        } else {
            acquire[2][0] = "Flamethrower";
            acquire[2][4] = "Sword";
        }
    }
    public static void accessoryRoom(String[][] acquire, ArrayList<String> inventory, Hero hero) 
    {
        Scanner in = new Scanner(System.in);
        if (inventory.contains(acquire[row][column])) {
            System.out.println("You've already picked up the item in this room. ");
            System.out.println("Your inventory contains:");
            for (int i = 0; i < inventory.size(); i++) 
                System.out.println(inventory.get(i));
            System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
            System.out.println("Type no if you'd like to keep the current inventory.");
            hero.action = in.next();
            for (int i = 0; i < inventory.size(); i++) {
                if (hero.action.equals(inventory.get(i))) {
                    inventory.remove(i);
                    if (hero.action.equals("Ring"))
                        hero.dexterity -= 1;
                }
            }
            return;
        }
        System.out.println("You've entered an accessory room.");
        System.out.printf("Would you like to pick up the %s? Type yes or no. \n", acquire[row][column]);
        hero.action = in.next();
            if (hero.action.equals("yes") && inventory.size() < 3) {
                inventory.add(acquire[row][column]);
                if (acquire[row][column].equals("Ring"))
                    hero.dexterity += 1;
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i));
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                return;
            } else if (hero.action.equals("yes") && inventory.size() == 3) {
                System.out.println("You do not have enough room in your inventory to pick up this item.");
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i) + " ");
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring")) 
                            hero.dexterity -= 1; 
                        System.out.printf("Since you have dropped something, the %s has been added to your inventory \n", acquire[row][column]); 
                        inventory.add(acquire[row][column]);
                    }
                }
                return;
            } else {
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i) + " ");
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                return;
            }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<String>();
        String[][] acquire = { {""}, {"", "", ""}, {"", "", "", "", ""}, {"", "", ""}, {""}};
        ArrayList<String> accessory = new ArrayList<String>();
        ArrayList<String> weapon = new ArrayList<String>();
        int fountainCount = 0;
        int weaponsCount = 0;
        double x;
        int prob;

        accessory.add("Key");
        accessory.add("Potion");
        accessory.add("Ring");
        accessory.add("Shield");
        
        shuffleAccessories(accessory, acquire);

        Hero hero = new Hero();

        Monster monster1 = new Monster(); // row 3, column 1
        Monster monster2 = new Monster(); // row 2, column 1
        Monster monster3 = new Monster(); // row 2, column 3
        Monster monster4 = new Monster(); // row 1, column 1

        Wizard wizard = new Wizard();
        
        row = 4;
        column = 0;

        System.out.println("Welcome to Dungeon!");

        while (hero.health > 0 && wizard.health > 0) {
            System.out.println("--------------------------");
            if (row == 0 && column == 0) { // wizard
                if (inventory.contains("Key"))
                    hero.battleWizard(wizard, row, column, inventory);
                else {
                    System.out.println("Area is locked. Find a key.");
                    System.out.println("Type s to go south");
                    dir = in.next();
                    row += 1;
                    column += 1;
                    continue;
                }
                if (hero.health < 0 || wizard.health < 0) 
                    continue;
                else {
                    row = hero.r;
                    column = hero.c;
                    continue;
                }
            } else if (row == 1 && column == 0) { // accessory
                accessoryRoom(acquire, inventory, hero);
                System.out.println("Type e or s to go east or south.");
                dir = in.next();
                if (dir.equals("e")) {
                    column += 1;
                } else {
                    row += 1;
                    column += 1;
                }
                continue;
            } else if (row == 1 && column == 1) { // monster
                if (monster1.health <= 0) {
                    System.out.println("The monster in this room has already died.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
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
                    continue;
                }
                else {
                    hero.battleMonster(monster1, row, column, dir, inventory);
                    row = hero.r;
                    column = hero.c;
                }
            } else if (row == 1 && column == 2) { // accessory
                accessoryRoom(acquire, inventory, hero);
                System.out.println("Type w or s to go west or south.");
                dir = in.next();
                if (dir.equals("w")) {
                    column -= 1;
                }
                else if (dir.equals("s")) {
                    column += 1;
                    row += 1;
                }
                continue;
            } else if (row == 2 && column == 0) { // weapons
                System.out.println("You've entered a weapons room.");
                if (weapon.contains(acquire[2][0])) {
                    System.out.println("You already have the weapon in this room.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
                        }
                    }
                    System.out.println("Type e to go east.");
                    dir = in.next();
                    if (dir.equals("e"))
                        column += 1;
                    continue;
                } else {
                    System.out.printf("Would you like to pick up the %s? Type yes or no. \n", acquire[2][0]);
                    hero.action = in.next();
                }
                if (hero.action.equals("yes") && weaponsCount == 0) {
                    weaponsCount++;;
                    if (acquire[2][0].equals("Sword")) {
                        hero.damage += 3;
                        weapon.add("Sword");
                    }
                    if (acquire[2][0].equals("Flamethrower")) {
                        hero.damage += 10;
                        hero.dexterity += 2;
                        weapon.add("Flamethrower");
                    }
                }
                else if (hero.action.equals("yes") && weaponsCount == 1) {
                    System.out.println("You can only have one weapon at a time.");
                    System.out.printf("Would you like to drop the %s? Type yes or no. \n", acquire[2][4]);
                    hero.action = in.next();
                    if (hero.action.equals("yes")) {
                        if (acquire[2][4].equals("Sword")) {
                            weapon.remove("Sword");
                            hero.damage -= 3;
                        }
                        if (acquire[2][4].equals("Flamethrower")) {
                            weapon.remove("Flamethrower");
                            hero.damage -= 10;
                            hero.dexterity -= 2;
                        }
                        if (acquire[2][0].equals("Sword")) {
                            System.out.println("The sword is your new weapon.");
                            weapon.add("Sword");
                            hero.damage += 3;
                        }
                        if (acquire[2][0].equals("Flamethrower")) {
                            System.out.println("The flamethrower is your new weapon.");
                            weapon.add("Flamethrower");
                            hero.damage += 10;
                            hero.dexterity += 2;
                        }
                    }   
                }
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i));
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                System.out.println("Type e to go east.");
                dir = in.next();
                if (dir.equals("e")) {
                    column += 1;
                }
                continue;

            } else if (row == 2 && column == 1) { // monster
                if (monster2.health <= 0) {
                    System.out.println("The monster in this room has already died.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
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
                    continue;
                }
                else {
                    hero.battleMonster(monster2, row, column, dir, inventory);
                }
                row = hero.r;
                column = hero.c;
                continue;
            } else if (row == 2 && column == 2) { // fountain
                if (fountainCount == 0) {
                    fountainCount++;
                    System.out.println("You have reached the fountain. Would you like to drink?");
                    System.out.println("Type yes or no.");
                    hero.action = in.next();
                    if (hero.action.equals("yes")) {
                        x = Math.random();
                        prob = (int) (10 * x) + 1;
                        if (prob <= 2) {
                            System.out.println("Your damage on monsters/wizards has increased by 2 pts!");
                            hero.damage += 2;
                        } else if (prob <= 4) {
                            System.out.println("Your dexterity has increased by 1 pt!");
                            hero.dexterity += 1;
                        } else if (prob <= 6) {
                            System.out.println("Uh oh. Your health decreased by 2 points..");
                            hero.health -= 2;
                        } else {
                            System.out.println("The fountain didn't do anything.");
                        }
                    }
                } else {
                    System.out.println("You've already came to the fountain.");
                }
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i));
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                System.out.println("Type n or e or s or w to go north, east, south, or west.");
                dir = in.next();
                if (dir.equals("n")) {
                    row -= 1;
                    column -= 1;
                } else if (dir.equals("e")) {
                    column += 1;
                } else if (dir.equals("w")) {
                    column -= 1;
                } else {
                    row += 1;
                    column -= 1;
                }
                continue;
            } else if (row == 2 && column == 3) { // monster
                if (monster3.health <= 0) {
                    System.out.println("The monster in this room has already died.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
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
                    continue;
                }
                else {
                    hero.battleMonster(monster3, row, column, dir, inventory);
                }
                row = hero.r;
                column = hero.c;
                continue;
            } else if (row == 2 && column == 4) { // weapons
                System.out.println("You've entered a weapons room.");
                if (weapon.contains(acquire[2][4])) {
                    System.out.println("You already have the weapon in this room.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
                        }
                    }
                    System.out.println("Type w to go west.");
                    dir = in.next();
                    if (dir.equals("w"))
                        column -= 1;
                    continue;
                } else {
                    System.out.printf("Would you like to pick up the %s? Type yes or no. \n", acquire[2][4]);
                    hero.action = in.next();
                }
                if (hero.action.equals("yes") && weaponsCount == 0) {
                    weaponsCount++;;
                    if (acquire[2][4].equals("Sword")) {
                        hero.damage += 3;
                        weapon.add("Sword");
                    }
                    if (acquire[2][4].equals("Flamethrower")) {
                        hero.damage += 10;
                        hero.dexterity += 2;
                        weapon.add("Flamethrower");
                    }
                }
                else if (hero.action.equals("yes") && weaponsCount == 1) {
                    System.out.println("You can only have one weapon at a time.");
                    System.out.printf("Would you like to drop the %s? Type yes or no. \n", acquire[2][0]);
                    hero.action = in.next();
                    if (hero.action.equals("yes")) {
                        if (acquire[2][0].equals("Sword")) {
                            weapon.remove("Sword");
                            hero.damage -= 3;
                        }
                        if (acquire[2][0].equals("Flamethrower")) {
                            weapon.remove("Flamethrower");
                            hero.damage -= 10;
                            hero.dexterity -= 2;
                        }
                        if (acquire[2][4].equals("Sword")) {
                            System.out.println("The sword is your new weapon.");
                            weapon.add("Sword");
                            hero.damage += 3;
                        }
                        if (acquire[2][4].equals("Flamethrower")) {
                            System.out.println("The flamethrower is your new weapon.");
                            weapon.add("Flamethrower");
                            hero.damage += 10;
                            hero.dexterity += 2;
                        }
                    }   
                }
                System.out.println("Your inventory contains:");
                for (int i = 0; i < inventory.size(); i++) 
                    System.out.println(inventory.get(i));
                System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                System.out.println("Type no if you'd like to keep the current inventory.");
                hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                System.out.println("Type w to go west.");
                dir = in.next();
                if (dir.equals("w")) {
                    column -= 1;
                }
                continue;
            } else if (row == 3 && column == 0) { // accessory
                accessoryRoom(acquire, inventory, hero);
                System.out.println("Type n or e to go north or east.");
                dir = in.next();
                if (dir.equals("n")) {
                    row -= 1;
                    column += 1;
                } else {
                    column += 1;
                }
                continue;
            } else if (row == 3 && column == 1) { // monster
                if (monster4.health <= 0) {
                    System.out.println("The monster in this room has already died.");
                    System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                    for (int i = 0; i < inventory.size(); i++) {
                        if (hero.action.equals(inventory.get(i))) {
                            inventory.remove(i);
                            if (hero.action.equals("Ring"))
                                hero.dexterity -= 1;
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
                    continue;
                }
                else {
                    hero.battleMonster(monster4, row, column, dir, inventory);
                }
                row = hero.r;
                column = hero.c;
                continue;
            } else if (row == 3 && column == 2) { // accessory
                accessoryRoom(acquire, inventory, hero);
                System.out.println("Type n or w to go north or west.");
                dir = in.next();
                if (dir.equals("n")) {
                    row -= 1;
                    column += 1;
                } else {
                    column -= 1;
                }
                continue;
            } else if (row == 4 && column == 0) { // start
                System.out.println("You are currently in the start position. ");
                System.out.println("Your inventory contains:");
                    for (int i = 0; i < inventory.size(); i++) 
                        System.out.println(inventory.get(i));
                    System.out.println("Would you like to drop anything? Type the name of the item you'd like to drop if so. ex. Ring");
                    System.out.println("Type no if you'd like to keep the current inventory.");
                    hero.action = in.next();
                for (int i = 0; i < inventory.size(); i++) {
                    if (hero.action.equals(inventory.get(i))) {
                        inventory.remove(i);
                        if (hero.action.equals("Ring"))
                            hero.dexterity -= 1;
                    }
                }
                System.out.println("Type n to go north.");
                dir = in.next();
                if (dir.equals("n")) {
                    row -= 1;
                    column += 1;
                }
                continue;
            }
        }
        if(hero.health <= 0) {
            System.out.println("Game over. ");
            return;
        } else if (wizard.health <= 0) {
            System.out.println("Congratulations! End of game. ");
            return;
        }   
    }
}