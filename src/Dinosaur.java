public class Dinosaur extends Stats {
    public Dinosaur() {

        this.intelligence = (int) (Math.random() * 10) + 10;
        this.durability = (int) (Math.random() * 5);
        this.strenght = (int) (Math.random() * 10);
    }
}
