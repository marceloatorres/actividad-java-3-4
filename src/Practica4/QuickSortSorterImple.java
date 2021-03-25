package Practica4;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] vector, Comparator c, int izquierda, int derecha) {
        Object pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        Object auxIntercambio;
        while (i < j) {
            while (c.compare(vector[i],pivote) <= 0 && i < j) {
                i++;
            }
            while (c.compare(vector[j], pivote) > 0) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            sort(vector,  c,izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            sort(vector,c, j + 1, derecha);
        }
    }
}
