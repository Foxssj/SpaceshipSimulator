import com.SpaceshipSim.SpaceShip;
import com.SpaceshipSim.Cargo;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Como se llama tu nave?");
            String nombreNave = sc.nextLine();

            System.out.println("Cual es la matrícula de tu nave?");
            String matricGalactica = sc.nextLine();

            System.out.println("Cual es la potencia de aceleración de tu nave?");
            int aceleracion = sc.nextInt();

            System.out.println("En que coordenada se encuentra? (X)");
            int coordenadaX = sc.nextInt();
            sc.nextLine();

            SpaceShip nicanave = new SpaceShip(nombreNave, matricGalactica, aceleracion, coordenadaX);

            System.out.println(nicanave + "\n" + "Que quiere hacer con su nave?");


            boolean salir = false;
            while (salir != true) {
                String eleccion = sc.nextLine();
                switch (eleccion) {
                    case "Acelerar":
                    case "acelerar":
                        System.out.println(nicanave + "\n Las coordenadas de la nave serian ("
                                + nicanave.speedUp() + ", 0)");
                        System.out.println("\t--> Que quiere hacer con su nave?");
                        break;
                    case "frenar":
                    case "Frenar":
                        System.out.println(nicanave + "\n Las coordenadas de la nave serian ("
                                + nicanave.brake() + ", 0)");
                        System.out.println("\t-->Que quiere hacer con su nave?");
                        break;
                    case "parar":
                    case "Parar":
                        System.out.println(nicanave + "\n Las coordenadas de la nave serian ("
                                + nicanave.emergencyStop() + ", 0)");
                        System.out.println("\t-->Que quiere hacer con su nave?");
                        break;
                    case "Salir":
                    case "salir":
                        System.out.println("Abandonando la nave...");
                        salir = true;
                }
            }
        }
}
