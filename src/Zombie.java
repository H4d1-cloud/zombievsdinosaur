public class Zombie extends Stats {
    public Zombie() {

        this.intelligence = (int) (Math.random() * 5);
        this.durability = (int) (Math.random() *10) +10;
        this.strenght = (int)  (Math.random() *5) +5;
    }
}
