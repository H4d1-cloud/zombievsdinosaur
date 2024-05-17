public abstract class Stats {

    protected int intelligence;
    protected int durability;
    protected  int strenght;

    public int PlayChess(){
        int total = (int) (Math.random() * 15) + intelligence;
        return Math.min(total, 40);
    }

    public int wrestle() {
        int total = (int) (Math.random() * 15) + strenght + durability;
        return Math.min(total, 40);
    }

    public int armWrestle() {
        int total = (int) (Math.random() * 15) + strenght;
        return Math.min(total, 40);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability){
        this.durability = durability;
    }

    public int getStrenght(){
        return strenght;
    }

    public void setStrenght(int strenght){
        this.strenght = strenght;
    }
}
