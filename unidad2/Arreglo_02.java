package unidad2;

public class Arreglo_02 {
	//int arreglo[]={10,9,8,5,1,0,-9,5};//Declarando y definiendo arreglo
	
	//Método
	public static int buscaDato(int arre[], int busca){
		int pos = -1;
		for(int i=0; i<arre.length; i++){
			if (busca == arre[i])
				pos=i;			
		}
		return pos;
	}
	
	//Método de la burbuja, ordenar de mayor a menor
	public static int[] ascendente(int arre[]){
		int aux;
		for (int j=0; j<(arre.length-1); j++){
		for (int i=0; i<(arre.length-1); i++){
			
			if(arre[i]<arre[i+1]){
				//Cambio arreglo
				aux=arre[i];
				arre[i]=arre[i+1];
				arre[i+1]=aux;
			}
			}
		}
		return arre;
	}
	
	public static String imprimeArreglo(int arre[]){
		String cadena="";
		for (int i=0; i<arre.length; i++){
			cadena=cadena + arre[i]+",";
			
		}
		return cadena;
	}

	public static void main(String[] args) {
		int arreglo[]={10,9,8,5,1,0,-9,5};
		/*int numeroBuscar = 1;
		int posiscion= buscaDato(arreglo, numeroBuscar); 
		
		if(posiscion==-1){
			System.out.println("No se encontro el dato");
		}else{
			System.out.println("El dato se encontro en... "+posiscion );
		}*/
		
		System.out.println("Arreglo origina:l "+imprimeArreglo(arreglo));
		System.out.println("Arreglo Ordenado: "+ imprimeArreglo(ascendente(arreglo)));
		
		
	}
}
