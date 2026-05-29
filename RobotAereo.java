public class RobotAereo extends Robot {
    public RobotAereo(String nombre, double rangoMaximo) {
        super(nombre, rangoMaximo);
    }

    @Override
    public void mostrarTipo() {
        System.out.println(nombre + " es un robot aéreo.");
    }
}
