package unidad2;

import java.util.Scanner;

public class Matriz {

	public static int[][] pedirDatos(int mat[][]){
		Scanner lector = new Scanner(System.in);
		for(int fila=0; fila<mat.length; fila ++){
			for(int col=0; col<mat[fila].length; col++){//se revisa cuanta solumnas tiene
				System.out.println("Escribe el dato fila["+fila+"], col["+col+"] -->");
				mat[fila][col]=lector.nextInt();
			}
		}
		
		return mat;
	}
	
	public static String mostrarDatos(int mat[][]){
		String result="";
		for(int fila=0; fila<mat.length; fila ++){
			for(int col=0; col<mat[fila].length; col++){//se revisa cuanta solumnas tiene
				result=result + mat[fila][col]+", ";
			}
			result=result+"\n";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] mat= new int [3][3];//el 2 son las filas y 3 columnas
		System.out.println(pedirDatos(mat));
		System.out.println(mostrarDatos(mat));
	}
}
