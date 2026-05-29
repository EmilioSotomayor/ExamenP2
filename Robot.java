import java.util.ArrayList;

public abstract class Robot {
    protected String nombre;
    protected double x;
    protected double y;
    protected double rangoMaximo;
    protected MapaRuta mapaRuta;

    public Robot(String nombre, double rangoMaximo) {
        this.nombre = nombre;
        this.rangoMaximo = rangoMaximo;
        this.x = 0;
        this.y = 0;
        this.mapaRuta = new MapaRuta();
    }

    public void registrarRuta(double nuevaX, double nuevaY) {
        mapaRuta.agregarPunto(nuevaX, nuevaY);
        this.x = nuevaX;
        this.y = nuevaY;
    }

    public double calcularDistanciaTotal() {
        return mapaRuta.calcularDistanciaTotal();
    }

    public boolean estaFueraDeRango() {
        double distanciaOrigen = Math.sqrt(x * x + y * y);
        return distanciaOrigen > rangoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarTipo();

    class MapaRuta {
        private ArrayList<Double> puntosX = new ArrayList<>();
        private ArrayList<Double> puntosY = new ArrayList<>();

        public MapaRuta() {
            puntosX.add(0.0);
            puntosY.add(0.0);
        }

        public void agregarPunto(double x, double y) {
            puntosX.add(x);
            puntosY.add(y);
        }

        public double calcularDistanciaTotal() {
            double distancia = 0;

            for (int i = 1; i < puntosX.size(); i++) {
                double dx = puntosX.get(i) - puntosX.get(i - 1);
                double dy = puntosY.get(i) - puntosY.get(i - 1);
                distancia += Math.sqrt(dx * dx + dy * dy);
            }

            return distancia;
        }
    }
}
