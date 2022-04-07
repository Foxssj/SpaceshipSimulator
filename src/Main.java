import com.SpaceshipSim.SpaceShip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como se llama tu nave?");
        String nombreNave = sc.nextLine();

        System.out.println("Cual es la matrícula de tu nave?");
        String matricGalactica = sc.nextLine();

        System.out.println("Cual es la potencia de aceleración de tu nave?");
        float aceleracion = sc.nextFloat();

        System.out.println("En que coordenada se encuentra? (X)");
        int coordenadaX = sc.nextInt();

        System.out.println("En que dirección va tu nave? (X)");
        int direccionX = sc.nextInt();
        sc.nextLine();

        SpaceShip nicanave = new SpaceShip(nombreNave, matricGalactica, aceleracion, coordenadaX, direccionX);

        System.out.println(nicanave);
    }


}
