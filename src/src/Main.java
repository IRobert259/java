public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static int suma (int a, int b) {
        return a +b;
    }
    static class Coche {
        public int puertas =4;

        public void SumarPuertas(){
            this.puertas++;
        }
    }

}