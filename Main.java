public class Main {
    public static void  main(String[] args){
        CentroControl centro = new CentroControl();
        Robot robot1 = new RobotAereo("Drone-01", 10);
        Robot robot2 = new RobotTerrestre("Rover-01", 8);
        Ingeniero ingeniero = new Ingeniero("Emilio");
        centro.agregarRobot(robot1);
        centro.agregarRobot(robot2);
        ingeniero.enviarComando(robot1, 3, 4);
        ingeniero.enviarComando(robot2, 6, 8);
        ingeniero.enviarComando(robot2, 2, 3);
        ingeniero.enviarComando(robot2, 9, 4);
        centro.mostrarDistancias();
        centro.mostrarRobotsFueraDeRango();
    }
}
