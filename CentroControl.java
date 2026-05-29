import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Robot> robots;

    public CentroControl() {
        robots = new ArrayList<>();
    }

    public void agregarRobot(Robot robot) {
        robots.add(robot);
    }

    public void mostrarDistancias() {
        System.out.println("\nDistancias recorridas:");

        for (Robot robot : robots) {
            System.out.println(robot.getNombre() + ": " + robot.calcularDistanciaTotal());
        }
    }

    public void mostrarRobotsFueraDeRango() {
        System.out.println("\nRobots fuera de rango:");

        for (Robot robot : robots) {
            if (robot.estaFueraDeRango()) {
                System.out.println("- " + robot.getNombre());
            }
        }
    }
}
