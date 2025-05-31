package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Khaulah Fauza Adila");
        System.out.println("245150707111009");
        System.out.println("=============================================");
        
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble(); // 7
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble(); // 3.5
        System.out.println("=============================================");
        Torus torus = new Torus(R, r);
        torus.printInfo();
        
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double r2 = input.nextDouble(); // 21
        System.out.println("=============================================");
        Sphere bola = new Sphere(r2);
        bola.printInfo();

        System.out.println("=============================================");
    }
}
