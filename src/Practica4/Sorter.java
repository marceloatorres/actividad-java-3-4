package Practica4;

import java.util.Comparator;

public interface Sorter<T>  {
    public  <T>  void  sort(T arr[], Comparator<T> c, int izquierda, int derecha);

}
