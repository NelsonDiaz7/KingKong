package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nodo {

    String info;
    int nohijos;
    Nodo hijos[];
    Nodo hijosT[];

    public Nodo(String dato) {
        info = dato;
        this.nohijos = 0;
    }

    public void copiarHijos() { //Permite la redimension del vector al aumentar un hijo
        hijosT = new Nodo[nohijos + 1];
        for (int i = 0; i < this.nohijos; i++) {
            hijosT[i] = hijos[i];
        }
    }

    public void aumentarHijos(Nodo nodo) {
        copiarHijos();
        hijosT[this.nohijos] = nodo;
        hijos = hijosT;
        this.nohijos++;
    }

    public String getDato() {
        return info;
    }

    public void setDato(String dato) {
        info = dato;
    }

    public void verNodo() {
        System.out.println("[" + info + "]");
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "info='" + info + '\'' +
                ", nohijos=" + nohijos +
                ", hijos=" + Arrays.toString(hijos);
    }
}