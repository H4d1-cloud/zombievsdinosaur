import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {

        ArrayList<Dinosaur> dinosaurs = new ArrayList<>();
        ArrayList<Zombie> zombies = new ArrayList<>();
        // Skapa lisa för sinosaurier och zombies

        Scanner sc = new Scanner(System.in);
        // Skapa scanner för att läsa in vad användarn skriver

        System.out.print("Hur många i dinosaurie laget?:  ");
        int numDinosaurs = sc.nextInt();
        // Fråga användaren hur många dinosauier som ska skapas

        System.out.print("Hur många Zombies i laget?:  ");
        int numZombies = sc.nextInt();

        for (int i = 0; i < numDinosaurs; i++) {
            Dinosaur dinosaur = new Dinosaur();
            dinosaurs.add(dinosaur);
            // Skapar dinosaurierobjekt och läggs till i listan

        }

        for (int i = 0; i < numZombies; i++) {
            Zombie zombie = new Zombie();
            zombies.add(zombie);
        }

        System.out.println("Det är " + dinosaurs.size() + " dinosaurier");
        System.out.println("Det är " + zombies.size() + " zombies");
        // Skriv ut antalet skapade dinosaurier respektive zombies

        System.out.println("Hello world!");

        sc.close();

    }
}
