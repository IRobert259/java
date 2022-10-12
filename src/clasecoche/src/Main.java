public class Main {
    public Main() {
    }

    public void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    static class Coche {
        public int puertas = 0;

        Coche() {
        }

        public void Sumarpuertas() {
            --this.puertas;
        }
    }
}


public class Main {
    public Main() {
    }

    public void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        miCoche.Sumarpuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    static class Coche {
        public int puertas = 0;

        Coche() {
        }

        public void Sumarpuertas() {
            --this.puertas;
        }
    }
}