/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author lug13995
 */
public class Module5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //==========Tableau==========\\
//        //Déclaration d'un tableau
//        int[] table1;
//        int table2[];
//
//        //Instancier un tableau de façon explicite
//        int[] table3 = {1, 2, 3};
//        int[] table4 = {1, 2, 3, 4,};
//        Object[] table5 = {new Object()};
//
//        //Instanciation un tableau avec new
//        System.out.println("J'instancier des tableaux avec des valeurs par défaut");
//        table1 = new int[10];
//        displayArray(table1);
//        table5 = new Object[11];
//        displayArray(table5);
//
//        //Fun fact la taille maximum d'un tableau dépend de la taille de votre JVM 
//        System.out.println("tableau de grande taille");
//        int[] tableMax = new int[21_470_000];
//        System.out.println("taille de mon tableau MAX :" + tableMax.length + "\n");
//
//        table3.length = 10; //Champs en lecture seul
//        //Initialisation par boucle
//        System.out.println("Initialisation de mon tableau par boucle");
//        for (int i = 0; i < table1.length; i++) {
//            table1[i] = i;
//        }
//        displayArray(table1);
//
//        //Les tableau en paramètre
//        //Créer un tableau sans le déclarer
////        displayArray({1,2,3,4});
//        System.out.println("Tableau créer sans le déclarer");
//        displayArray(new int[]{1, 2});
//
//        //Passage par référence
//        System.out.println("Mon tableau est toujours passé par référence");
//        displayArray(table4);
//        updateArray(table4);
//        displayArray(table4);
//
//        //Copie d'un tableau
//        int[] tableCopy = new int[10];
//        System.out.println("Mon tableau à copier et mon nouveau tableau");
//        displayArray(table3);
//        displayArray(tableCopy);
//        System.arraycopy(table3, 0, tableCopy, 0, table3.length);
//        System.out.println("La copie à été fait");
//        displayArray(table3);
//        displayArray(tableCopy);
//        System.out.println("Si je modifie le premier le second n'est pas touché");
//        updateArray(table3);
//        displayArray(table3);
//        displayArray(tableCopy);
//
//        System.out.println("Astuce pour ne pas perdre sa référence");
//        table3 = tableCopy;
//        System.out.println("Si j'en modifie un l'autre l'es aussi");
//        updateArray(table3);
//        displayArray(table3);
//        displayArray(tableCopy);
//
//        //Les exception 
//        try {
//            table1[Integer.MAX_VALUE] = 1;
//        } catch (Exception e) {
//            System.out.println(e.getClass());
//        }
//
//        //==========Tableau multidimensionnelle==========\\
//        //déclaration d'un tableau multidimensionnelle
//        int[][] tableM1;
//        int tableM2[][];
//        int[] tableM3[];
//
//        //Instancier un tableau multidimensionnelle de façon explicite
//        int[][] tableM4 = {{1, 2}, {1, 2}, {1, 2}}; //Deviné combien de tableau on été réélement créer ici ?
//
//        //Instanciation avec une taille différente
//        int[][] tableM5 = {
//            {1},
//            {1, 2},
//            {1, 2, 3},};
//
//        System.out.println("instanciation explicite");
//        display(tableM4);
//        display(tableM5);
//
//        //Instanciation avec new
//        tableM1 = new int[][]; /: ne fonctionne pas
//        tableM1 = new int[3][2]; //Les autres dimension on toute la même taille
//        tableM2 = new int[3][]; //La seconde dimension n'est pas encore définis une boucle pourra initialisé la taille plus tard
//        tableM2 = new int[][3]; //Impossible de construire une dimension sur une dimension non initialisé
//        int[][][] tableM6;
//        tableM6 = new int[10][][]; //Fonctionne
//        tableM6 = new int[10][10][]; //Fonctionne
//        System.out.println("instanciation par new");
//        display(tableM1);
//
//        //Instanciation avec boucle imbriqué + dimension différente
//        System.out.println("Initialisation de mon tableau par boucle");
//        for (int i = 0; i < tableM2.length; i++) {
//            for (int j = 0; j < tableM2.length; j++) {
//                tableM2[i] = new int[i];
//            }
//
//        }
//        display(tableM2);
//
//        //==========ArrayList==========\\
//        //La déclaration
//        java.util.List list;
//        java.util.ArrayList arrayList;
//
//        //Instanciation
//        list = new ArrayList(); //Tableau interne de 10
//        arrayList = new ArrayList(20); //Tableau interne de 20
//        System.out.println("Instanciation");
//        System.out.println("Taille de ma liste de base " + list.size());
//        System.out.println("Taille de mon arraylist customisé " + arrayList.size());
//
//        //Les list n'accèpte pas les type primitif
//        list.add(new Integer(1));
//        list.add(new Integer(2));
//        list.add(new Integer(3));
//
//        //Construction via une autre liste
//        System.out.println("Instanciation depuis une autre liste");
//        arrayList = new ArrayList(list);
//        display(list);
//        display(arrayList);
//
//        //Les méthode 
//        System.out.println("Méthode get : " + arrayList.get(0));
//        System.out.println("Méthode indexOf : " + arrayList.indexOf(new Integer(1)));
//        System.out.println("Méthode remove : " + arrayList.remove(1));
//        display(arrayList);
//        System.out.println("Méthode remove : " + arrayList.removeAll(arrayList));
//        display(arrayList);
//        System.out.println("Méthode isEmpty : " + arrayList.isEmpty());
//
//        //Generics
//        arrayList.add("Hello");
//        arrayList.add("Panda");
//        arrayList.add(new Object());
//        String s = (String) arrayList.get(0); //Obliger de caster.
//
//        ArrayList<Integer> listOfInteger = new ArrayList<Integer>(); //Noter que on utilise toujorus la classe enveloppe
//        listOfInteger.add(new Integer(1));
//        listOfInteger.add(new Integer(2));
//        listOfInteger.add("Ninja !");
//
//        ArrayList<String> listOfString = new ArrayList<>();
//        listOfString.add("Hello");
//        listOfString.add("Firefox");
//        String s2 = listOfString.get(1);
//
//        //Les exceptions
//        try {
//            listOfInteger.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
//
//        } catch (Exception e) {
//            System.out.println(e.getClass());
//        }
//        
//
    }

    static void displayArray(Object[] table) {
        for (Object o : table) {
            System.out.println("Contenue de mon tableau : " + o);
        }
        System.out.println("Taille de mon tableau : " + table.length);
        System.out.println("\n");
    }

    static void displayArray(int[] table) {
        for (int i : table) {
            System.out.println("Contenue de mon tableau : " + i);
        }
        System.out.println("Taille de mon tableau : " + table.length);
        System.out.println("\n");
    }

    static void updateArray(int[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = 0;
        }
    }

    static void display(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("Contenue de mon tableau : " + table[i][j]);
            }

        }
        System.out.println("Taille de ma première dimmension : " + table.length);
        System.out.println("Taille de ma seconde dimmension : " + table[0].length);
        System.out.println("Taille d'une autre seconde dimmension : " + table[1].length);
        System.out.println("\n");

    }

    static void display(List list) {
        for (Object o : list) {
            System.out.println("Ma liste contient : " + o.toString());
        }
        System.out.println("La taille de ma liste est : " + list.size());
        System.out.println("\n");
    }
}
