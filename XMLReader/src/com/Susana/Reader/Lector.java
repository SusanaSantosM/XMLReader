package com.Susana.Reader;

import com.Susana.Serializacion2.Producto;
import com.Susana.Serializacion2.Productos;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {

    public static ArrayList<Productos> deserealizacion(String archivo){
        try{
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream oin = new ObjectInputStream(fis);

            //Leemos el ArrayList
            ArrayList<Producto> productos = (ArrayList<Producto>) oin.readObject();

            //Imprimimos
            for(Producto prod : productos){
                System.out.println( "\tCódigo:"+prod.getCodigo()+
                        "\tProducto: "+ prod.getDesc()+
                        "\tPrecio: "+ prod.getPrecio());
            }
            //Cerramos stream
            oin.close();

        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Ha ocurrido un error.");
        }
        return null;
    }

}
