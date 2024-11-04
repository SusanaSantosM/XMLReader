package com.Susana.Reader;

import com.Susana.Serializacion2.Productos;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String archivoSerializado="../Serializacion2/archivo.txt";

    public static void main(String[] args) {
        Path path = Paths.get(archivoSerializado);

        // Verificamos si el archivo existe
        if (Files.exists(path)) {
            // Deserealizamos los productos
            ArrayList<Productos>productos = Lector.deserealizacion(archivoSerializado);
        } else {
            System.out.println("El archivo no existe");
        }



    }
}