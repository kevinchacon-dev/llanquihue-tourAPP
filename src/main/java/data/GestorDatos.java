package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(Path rutaArchivo) throws IOException {

        // Creamos la lista que almacenara los tours
        ArrayList<Tour> listaDeTours = new ArrayList<>();

        // Abrimos el archivo para leerlo
        try (BufferedReader lector =
                     Files.newBufferedReader(rutaArchivo, StandardCharsets.UTF_8)) {

            String linea;

            // Leemos el archivo linea por linea
            while ((linea = lector.readLine()) != null) {

                // Ignoramos las lineas vacias
                if (linea.isBlank()) {
                    continue;
                }

                // Separamos los datos usando el punto y coma
                String[] campos = linea.split(";");

                // Comprobamos que existan 3 campos
                if (campos.length != 3) {
                    System.err.println("Registro invalido: " + linea);
                    continue;
                }

                // Obtenemos los datos de cada campo
                String nombre = campos[0].trim();
                String tipo = campos[1].trim();
                double precio = Double.parseDouble(campos[2].trim());

                // Creamos el objeto Tour
                Tour tour = new Tour(nombre, tipo, precio);

                // Agregamos el objeto a la lista
                listaDeTours.add(tour);
            }
        }

        // Devolvemos la lista completa
        return listaDeTours;
    }
}