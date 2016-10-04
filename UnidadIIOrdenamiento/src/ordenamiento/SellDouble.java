
package ordenamiento;

/**
 *
 * @Ana Carolina Padrón Sandoval
 */
public class SellDouble {

   public static void ShellDouble (double[] a) {
        int next=a.length/2;
        while(next>=1){
        for(int file=next;file<a.length;file++){
            double aux=a[file];
            int j=file-next;
            while(j>=0&&a[j]>aux){
                a[j+next]=a[j];
                j-=next;
            }
            a[j+next]=aux;
        }
        next/=2;
        }
    }

    public static void imprimir(double []a){
        String salida="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                salida+=" "+a[i]+" ";
            else
                salida+=a[i]+" "; 
        }
        System.out.println(salida); 
    }
    
    
       public static void main (String[] args) {
        double b[]={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
       
           ShellDouble(b);
           imprimir(b);
        
       }
}
