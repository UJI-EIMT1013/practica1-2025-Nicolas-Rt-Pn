package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        HashSet<Integer> result= new HashSet<Integer>();
        ArrayList<Integer> vistos= new ArrayList<Integer>();

        while(it.hasNext()){
            boolean added=false;
            Integer e=it.next();

            for(int i=0; i<vistos.size(); i++){
                int n=vistos.get(i);
                    if(e%n==0){
                        result.add(e);
                        added=true;

                    } else if (n%e==0) {
                        result.add(n);
                        added=true;
                    }
            }

            if(!added){
            vistos.add(e);
            }

        }
        return result;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        Iterator<Integer> it= cuadrados.iterator();
        Iterator<Integer> it2= noCuadrados.iterator();


        while(it.hasNext()) {
            Integer e1 = it.next();
            Integer e1_cuadrado = e1 * e1;
            if (cuadrados.contains(e1_cuadrado) || noCuadrados.contains(e1_cuadrado)) {
                cuadrados.add(e1_cuadrado);
                noCuadrados.add(e1);
                cuadrados.remove(e1);
                noCuadrados.remove(e1_cuadrado);
            }

            Integer e2 = it2.next();
            Integer e2_cuadrado=e2*e2;
            if (cuadrados.contains(e2_cuadrado) || noCuadrados.contains(e2_cuadrado)) {
                cuadrados.add(e2_cuadrado);
                noCuadrados.remove(e2_cuadrado);
            }
        }

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
