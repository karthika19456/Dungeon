public class Wizard 
{
    public int damage;
    public int health;

    public Wizard() 
    {
        double x = Math.random();
        this.damage = (int) (5 * x) + 4;
        double y = Math.random();
        this.health = (int) (13 * y) + 12;
    }
}
