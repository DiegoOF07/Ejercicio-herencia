/**
 * @author: Diego Oswaldo Flores 23714
 * @version: 24/09/2023b
 * 
 * El objetivo del siguiente programa es automatizar el proceso de analisis
 * de estadisticas de diferentes jugadores a traves de su efectividad
 */

import java.util.Scanner;

public class Principal {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Campeonato camp = new Campeonato();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nCAMPEONATO\n");
            System.out.println("1. Agregar porteros");
            System.out.println("2. Agregar extremos");
            System.out.println("3. Mostrar todos los jugadores");
            System.out.println("4. Mostrar los mejores porteros");
            System.out.println("5. Cantidad de extremos efectivos");
            System.out.println("6. Salir");
            System.out.print("Elige la opcion que desees: ");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    try {
                        System.out.println("AGREGANDO PORTEROS\n");
                        System.out.print("Ingresa el nombre del jugador: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingresa el pais del jugador: ");
                        String pais = sc.nextLine();
                        System.out.print("Ingresa las faltas del jugador: ");
                        int faltas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa los goles directos del jugador: ");
                        int golesDirectos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa el total de lanzamientos del jugador: ");
                        int totalLanzamientos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa las paradas efectivas del jugador: ");
                        int paradasEfectivas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa los goles recibidos del jugador: ");
                        int golesRecibidos = sc.nextInt();
                        sc.nextLine();
                        camp.agregarPortero(nombre, pais, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos);
                    } catch (Exception e) {
                        System.out.println("Has ingresado mal un dato");
                        sc.nextLine();
                    }
                    break;
                case "2":
                    try {
                        System.out.println("AGREGANDO EXTREMOS\n");
                        System.out.print("Ingresa el nombre del jugador: ");
                        String nombre = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Ingresa el pais del jugador: ");
                        String pais = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Ingresa las faltas del jugador: ");
                        int faltas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa los goles directos del jugador: ");
                        int golesDirectos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa el total de lanzamientos del jugador: ");
                        int totalLanzamientos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa los pases efectivos del jugador: ");
                        int pasesEfectivos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingresa las asistencias efectivas del jugador: ");
                        int asistenciasEfectivas = sc.nextInt();
                        sc.nextLine();
                        camp.agregarExtremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pasesEfectivos, asistenciasEfectivas);
                    } catch (Exception e) {
                        System.out.println("Has ingresado mal un dato");
                        sc.nextLine();
                    }
                    break;
                case "3":
                    System.out.println("TODOS LOS JUGADORES\n");
                    camp.mostrarJugadores();
                    break;
                case "4":
                    camp.mejoresPorteros();
                    break;
                case "5":
                    System.out.println("\nLa cantidad de extremos efectivos es: "+camp.extremosEfectivos());
                    break;
                case "6":
                    continuar = false;
                    break;
            
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }
        sc.close();

    }
}
