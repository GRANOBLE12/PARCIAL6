/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MATRIZ;

import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Bus {

    String[][] Buses = new String[2][3];
    Scanner in = new Scanner(System.in);

    void GestionBus() {
        for (int i = 0; i < Buses.length; i++) {
        String Placa = null;
        String Empresa = null;
        String Capacidad = null;

        System.out.println("Digite la placa del bus");
        Placa = in.next();
        System.out.println("Digite el total de pasajeros");
        Capacidad=in.next();
        System.out.println("Digite la emresa a la que pertenece");
        Empresa = in.next();
        
            Buses[i][0] = Placa;
            Buses[i][1] = Capacidad;
            Buses[i][2] = Empresa;
            System.out.println("Producto Almacenado Exitosamente");
        } 
    }

    void Listar() {
        System.out.println("Listando datos guardados");
        System.out.println("Placa / Capacidad / Empresa");
        for (int i = 0; i < Buses.length; i++) {
            if (Buses[i][2] != null && Buses[i][2].equals("Sotracauca")) {
                System.out.println(Buses[i][0] + " / " + Buses[i][1] + " / " + Buses[i][2]);
            }
        }
    }

    void promedioPasajeros() {
        int suma = 0;
        System.out.println("Promedio");
        for (int i = 0; i < Buses.length; i++) {
            suma += Integer.parseInt(Buses[i][1]);
        }
        double promedio = (double) suma / Buses.length;
        System.out.println("El promedio de pasajeros es: " + promedio);
    }

    void Menú() {
        int opcion = 0;
        do {
            System.out.println("""
                           ******MENU DE OPCIONES******
                           
                           1.Registrar Buses 
                           2. Listar Buses De Sotracauca
                           3.Promedio De Pasajeros
                           4.Salir
                           
                           Digite Una Opcion Valida""");
            opcion=in.nextInt();
            switch (opcion) {
                case 1:
                    this.GestionBus();
                    break;
                case 2:
                    this.Listar();
                    break;
                case 3:
                    this.promedioPasajeros();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida");
                    break;
            }
        } while (opcion!=4);
 
    }
}
