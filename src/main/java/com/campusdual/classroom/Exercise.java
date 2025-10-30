package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise {

    public static List<String> createArrayList() {
        List<String> ArrayList = new ArrayList<>();

        ArrayList.add("GKFFD");
        ArrayList.add("TNANA");
        ArrayList.add("MPMSL");
        ArrayList.add("PSWME");
        ArrayList.add("LZMLF");
        ArrayList.add("JYEBV");
        ArrayList.add("YELNT");
        ArrayList.add("JSNKR");
        ArrayList.add("JFESF");
        ArrayList.add("TMJLL");


        return ArrayList;

    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Índice " + i + ": " + customList.get(i));
        }
    }



    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add (element);
    }


    public static void main(String[] args) {
        List<String> Arraylist = createArrayList();

        System.out.println("Lista original:");
        printElementsAndIndex(Arraylist);

        addElementToList(Arraylist, "AAAAA");

        System.out.println("\nLista actualizada:");
        printElementsAndIndex(Arraylist);
    }
}