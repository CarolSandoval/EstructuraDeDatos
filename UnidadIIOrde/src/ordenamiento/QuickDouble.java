
package ordenamiento;

import static java.util.Arrays.sort;

/**
 *
 * @Ana Carolina Padrón Sandoval
 */
public class QuickDouble {
    public static void QuickSortDoble( double[] arreglo ){
        double[] izq = null, der = null;
        int      numizq, numder;
        double   pivote;
        int      i, j, k;
        if ( arreglo.length <= 1 ){
            return;
        }
        pivote = arreglo[arreglo.length-1];
        numizq = numder = 0;
        for ( i = 0; i < arreglo.length-1; i++ )
            if ( arreglo[i] <= pivote )
                numizq++;
            else
                numder++;
            izq  = new double[numizq];
            der = new double[numder];
            i = 0;
            j = 0;
            for ( k = 0; k < arreglo.length-1; k++ )
                if ( arreglo[k] <= pivote )
                    izq[i++] = arreglo[k];
                else
                    der[j++] = arreglo[k];
            sort(izq);
            sort(der);
            k = 0;
            for ( i = 0; i < izq.length; i++ )
                arreglo[k++] = izq[i];
                arreglo[k++] = pivote;
            for ( j = 0; j < der.length; j++ )
                arreglo[k++] = der[j];
    }
    
       public static void imprimir(double []a){
        String sal="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                sal+=" "+a[i]+" ";
            else
                sal+=a[i]+" "; 
        }
        System.out.println(sal); 
    }
           public static void main (String[] args) {
        double b[]={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
          System.out.println("QuickSort Double");
	QuickSortDoble(b);
        imprimir(b);
    
    
           }
}
