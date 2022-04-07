package com.SpaceshipSim;

public class SpaceShip {
    private String Nombre;
    private String MatrículaGaláctica;
    private float Aceleración;
    private float VelocidadX;
    private float VelocidadY;
    private int CoordenadaX;
    private int CoordenadaY;
    private float DirecciónX;
    private float DirecciónY;

    public SpaceShip(String nombre, String matrículaGaláctica,
                     float aceleracion, int coordenadaX,
                     float direcciónX) {
        Nombre = nombre;
        MatrículaGaláctica = matrículaGaláctica;
        Aceleración = aceleracion;
        CoordenadaX = coordenadaX;
        DirecciónX = direcciónX;
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
