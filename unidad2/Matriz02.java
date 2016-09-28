package unidad2;

public class Matriz02 {
	
	public static String mostrArregol(double tb[][]){
		String resultado="";
		for(int fila=0; fila<tb.length; fila ++){
			for(int col=0; col<tb[fila].length; col++){//se revisa cuanta solumnas tiene
				resultado=resultado + tb[fila][col]+", ";
			}
			resultado=resultado+"\n";
		}
		return resultado;
	}
	
	public static void suma(double tb[][]){
		double suma =0.0;
		for(int fila=0; fila<tb.length; fila ++){
			suma =0;
			for(int col=0; col<tb[fila].length; col++){
				suma=suma+tb[fila][col];
			}
			System.out.println("suma igual a:" +suma);
		}
		
	}

	public static void main(String[] args) {
		double[][] tb= {{1.5, -2.5}, {5.0, -0.0, 1.5}};
		System.out.println(mostrArregol(tb));
		suma(tb);
	}
	
}
