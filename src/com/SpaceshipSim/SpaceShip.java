package com.SpaceshipSim;

public class SpaceShip {
    private String Nombre;
    private String MatrículaGaláctica;
    private int Aceleracion;
    private int VelocidadX = 0;
    private int VelocidadY;
    private int CoordenadaX;
    private int CoordenadaY;
    private int DirecciónX;
    private int DirecciónY;

    public SpaceShip(String nombre, String matrículaGaláctica,
                     int aceleracion, int coordenadaX) {
        Nombre = nombre;
        MatrículaGaláctica = matrículaGaláctica;
        Aceleracion = aceleracion;
        CoordenadaX = coordenadaX;
    }

    public int speedUp() {
        VelocidadX = VelocidadX + Aceleracion;
        CoordenadaX = CoordenadaX + VelocidadX;
        return CoordenadaX;
    }

    public int brake() {
        VelocidadX = VelocidadX - Aceleracion;
        CoordenadaX = CoordenadaX + VelocidadX;
        return CoordenadaX;
    }

    public int emergencyStop() {
        VelocidadX = 0;
        CoordenadaX = CoordenadaX + VelocidadX;
        return CoordenadaX;
    }

    public String toString() {
        return "                     `. ___\n" +
                "                    __,' __`.                _..----....____\n" +
                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
                ",'________________                          \\`-._`-','    " + Nombre + "\n" +
                " `._              ```````````------...___   '-.._'-:      " + MatrículaGaláctica + "\n" +
                "    ```--.._      ,.                     ````--...__\\-.\n" +
                "            `.--. `-`                       ____    |  |`\n" +
                "              `. `.                       ,'`````.  ;  ;`\n" +
                "                `._`.        __________   `.      \\'__/`\n" +
                "                   `-:._____/______/___/____`.     \\  `\n" +
                "                               |       `._    `.    \\\n" +
                "                               `._________`-.   `.   `.___\n" +
                "                                             SSt  `------'`";
    }
}
