package co.edu.unbosque.controller;

import java.util.Scanner;

public class Controller {


    Arbol arbol = new Arbol();
    Scanner scanner = new Scanner(System.in);



    public Controller()
    {
        init();
    }

    public void init()
    {
       System.out.println("Ingrese la cantidad de casos que quiere realizar");
        int veces = scanner.nextInt();

        for(int i=0 ; i < veces ; i++)
        {
            System.out.println("Ingrese la cantidad de nodos que quiere agregar, sin contar la raiz");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese la raiz del arbol");
            String raiz = scanner.nextLine();

            Nodo nodo = arbol.insertarRaiz(raiz);

            for(int j=0 ; j < cantidad ; j++)
            {
                    System.out.println("Ingrese el nombre o número del nodo");
                    String nombre = scanner.nextLine();

                    System.out.println("ingrese el padre del nodo que acaba de ingresar");
                    String padre = scanner.nextLine();

                    arbol.InsertarRecursivo(nodo, nombre, padre);

            }
            arbol.raíz.verNodo();
            arbol.verHijosRecursivo(nodo);

            System.out.println("Altura del arbol: " + arbol.alturaRecursiva(nodo));

            System.out.println("Recorrido por niveles: ");
            arbol.recorrerNiveles2(nodo);

        }
    }
}


