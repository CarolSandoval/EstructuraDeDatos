package ordenamiento;


/**
 *
 * @Ana Carolina Padrón Sandoval
 */
public class ShellInt {
    public static void ShellsortInt (int[] a) {
        int siguiente=a.length/2;
        while(siguiente>=1){
        for(int guardado=siguiente;guardado<a.length;guardado++){
            int auxiliar=a[guardado];
            int j=guardado-siguiente;
            while(j>=0&&a[j]>auxiliar){
                a[j+siguiente]=a[j];
                j-=siguiente;
            }
            a[j+siguiente]=auxiliar;
        }
        siguiente/=2;
        }
    }
    
    public static void ShellDouble (double[] a) {
        int siguiente=a.length/2;
        while(siguiente>=1){
        for(int rec=siguiente;rec<a.length;rec++){
            double auxiliar=a[rec];
            int j=rec-siguiente;
            while(j>=0&&a[j]>auxiliar){
                a[j+siguiente]=a[j];
                j-=siguiente;
            }
            a[j+siguiente]=auxiliar;
        }
        siguiente/=2;
        }
    }

    public static void imprimeA(int []a){
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
        int a[] = { 25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
       
       
        System.out.println("Shell Int");
        ShellsortInt(a);
        imprimeA(a);
        
       }
}
