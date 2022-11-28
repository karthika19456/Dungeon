import java.util.Scanner;

public class Monster 
{
    public int damage;
    public int health;

    Scanner in = new Scanner(System.in);

    public Monster()
    {
        double x = Math.random();
        this.damage = (int) (4 * x) + 1;
        double y = Math.random();
        this.health = (int) (6 * y) + 5;
    }
}
