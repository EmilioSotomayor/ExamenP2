public class Ingeniero {
    private String nombre;

    public Ingeniero(String nombre) {
        this.nombre = nombre;
    }

    public void enviarComando(Robot robot, double x, double y) {
        System.out.println(nombre + " envía comando a " + robot.getNombre());
        robot.registrarRuta(x, y);
    }
}
