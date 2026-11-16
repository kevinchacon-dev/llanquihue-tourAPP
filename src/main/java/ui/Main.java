package ui;

import data.GestorDatos;
import model.Tour;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Indicamos la ruta del archivo
        Path rutaArchivo = Path.of("src/main/resources/tours.txt");

        // Creamos el gestor de datos
        GestorDatos gestorDatos = new GestorDatos();

        try {

            // Cargamos los tours desde el archivo
            ArrayList<Tour> listaDeTours =
                    gestorDatos.cargarTours(rutaArchivo);

            // Mostramos la cantidad de tours cargados
            System.out.println("--- LLANQUIHUE TOUR ---");
            System.out.println("Tours cargados: " + listaDeTours.size());

            // Recorrido de todos los tours
            System.out.println("\n1. TODOS LOS TOURS");
            System.out.println("====================");

            for (Tour tour : listaDeTours) {
                System.out.println(tour);
            }

            // Filtramos los tours con precio mayor a 25000
            System.out.println("\n2. TOURS CON PRECIO MAYOR A $25.000");
            System.out.println("====================================");

            for (Tour tour : listaDeTours) {

                if (tour.getPrecio() > 25000) {
                    System.out.println(tour);
                }
            }

        } catch (IOException e) {

            System.err.println("Error al leer el archivo:");
            System.err.println(e.getMessage());

        }
    }
}