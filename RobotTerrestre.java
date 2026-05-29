public class RobotTerrestre extends Robot {
    public RobotTerrestre(String nombre, double rangoMaximo) {
        super(nombre, rangoMaximo);
    }

    @Override
    public void mostrarTipo() {
        System.out.println(nombre + " es un robot terrestre.");
    }
}
