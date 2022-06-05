package co.edu.unbosque.controller;

public class Arbol {
    Nodo raíz;

    public Nodo insertarRaiz(String dato) {
        raíz = new Nodo(dato);
        return raíz;
    }

    public void verHijosRecursivo(Nodo nodo) {
        for (int i = 0; i < nodo.nohijos; i++) {
            nodo.hijos[i].verNodo();
            verHijosRecursivo(nodo.hijos[i]);
        }
    }

    public void InsertarRecursivo(Nodo nodo, String dato, String padre) {
        Nodo nuevo = new Nodo(dato);
        //Cuando el padre es la raiz
        if (nodo.getDato().equals(padre)) {
            nodo.aumentarHijos(nuevo);
        } else {
            //Si el padre es alguno de los hijos
            for (int i = 0; i < nodo.nohijos; i++) {
                if (nodo.hijos[i].getDato().equals(padre)) {
                    //Se coloca el hijo en el nodo
                    nodo.hijos[i].aumentarHijos(nuevo);
                } else {
                    InsertarRecursivo(nodo.hijos[i], dato, padre);
                }
            }
        }
    }

    public int alturaRecursiva(Nodo nodo) {
        int mayor=0;
        int tempo;

        if(nodo == null) {
            return 0;
        }else{
            for(int i = 0; i < nodo.nohijos; i++) {
                tempo = alturaRecursiva(nodo.hijos[i]);
                if(tempo > mayor) {
                    mayor = tempo;
                }
            }
            return mayor+1;
        }
    }

  /*  public void recorrerNiveles(Nodo nodo) {
        if (nodo.nohijos == 0) {
            System.out.println(" " + nodo.getDato());
        } else if(nodo.nohijos > 0) {
                System.out.println(" " + nodo.getDato());
              for(int j = 0; j < nodo.nohijos; j++){
                    recorrerNiveles(nodo.hijos[j]);
            }
        }
    }*/

    public void recorrerNiveles2(Nodo nodo) {
        if (nodo.nohijos == 0) {
            System.out.println(" " + nodo.getDato());
        } else if(nodo.nohijos > 0) {
            System.out.println(" " + nodo.getDato());
            for(int i = 0; i < nodo.nohijos; i++) {
                recorrerNiveles2(nodo.hijos[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "raíz=" + raíz +
                '}';
    }
}
