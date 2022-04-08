package com.SpaceshipSim;

public class SpaceShip {
    private String nombre;
    private String matrículaGaláctica;
    private int aceleracion;
    private int velocidadX = 0;
    private int velocidadY;
    private int coordenadaX;
    private int coordenadaY;
    private int direcciónX;
    private int direcciónY;



    public SpaceShip(String nombre, String matrículaGaláctica,
                     int aceleracion, int coordenadaX) {
        this.nombre = nombre;
        this.matrículaGaláctica = matrículaGaláctica;
        this.aceleracion = aceleracion;
        this.coordenadaX = coordenadaX;
    }

    public int speedUp() {
        velocidadX = velocidadX + aceleracion;
        coordenadaX = coordenadaX + velocidadX;
        return coordenadaX;
    }

    public int brake() {
        velocidadX = velocidadX - aceleracion;
        coordenadaX = coordenadaX + velocidadX;
        return coordenadaX;
    }

    public int emergencyStop() {
        velocidadX = 0;
        coordenadaX = coordenadaX + velocidadX;
        return coordenadaX;
    }

    public String toString() {
        return "                     `. ___\n" +
                "                    __,' __`.                _..----....____\n" +
                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
                ",'________________                          \\`-._`-','    " + nombre + "\n" +
                " `._              ```````````------...___   '-.._'-:      " + matrículaGaláctica + "\n" +
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
