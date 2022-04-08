    package com.SpaceshipSim;

    public class Cargo extends SpaceShip {

        private int maxCargo;
        private int containers;

        public Cargo(String nombre, String matrículaGaláctica,
                     int aceleracion, int coordenadaX, int maxCargo, int containers) {
            super(nombre, matrículaGaláctica, aceleracion, coordenadaX);
            this.maxCargo = maxCargo;
            this.containers = containers;
        }

        public int getMaxCargo() {
            return maxCargo;
        }

        public void setMaxCargo(int maxCargo) {
            this.maxCargo = maxCargo;
        }

        public int getContainers() {
            return containers;
        }

        public void setContainers(int containers) {
            this.containers = containers;
        }

        public int load() {
            if (containers >= maxCargo) {
                System.out.println("La nave de carga ya está llena");
            } else {
                containers = containers + 1;
            }
            return containers;
        }

        public int unLoad() {
            if (containers <= 0) {
                System.out.println("La nave de carga está vacia");
            } else {
                containers = containers - 1;
            }
            return containers;
        }

}
