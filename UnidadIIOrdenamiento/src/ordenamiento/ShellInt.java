package ordenamiento;


/**
 *
 * @Ana Carolina Padrón Sandoval
 */
public class ShellInt {
    public static void ShellInt (int[] a) {
        int next=a.length/2;
        while(next>=1){
        for(int file=next;file<a.length;file++){
            int au=a[file];
            int j=file-next;
            while(j>=0&&a[j]>au){
                a[j+next]=a[j];
                j-=next;
            }
            a[j+next]=au;
        }
        next/=2;
        }
    }
   
    public static void imprimir(int []a){
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
        int a[] = { 25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
       
       
        
        ShellInt(a);
        imprimir(a);
        
       }

}
