package unidad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arreglo01 {
	String alumno[]; //Declaracion de arreglo
	float calif[];
	Scanner fileReader = null;
	int tamaño; //Para tamaño de arreglo
	
	public void definirArreglo(){
		try{
			fileReader = new Scanner(new File("lista.txt"));
			System.out.println("Archivo Abiero :lista.txt");
			
		}catch (FileNotFoundException e){
			System.out.println("El archivo no se encuentra");
			System.out.println("Programa Terminado");
			System.exit(0);
		}
		int tamaño = fileReader.nextInt();
		alumno = new String[tamaño];
		calif = new float[tamaño];
	}
	
	public void recorrerArreglo(){
		for(int i= 0; i<alumno.length; i++){
			alumno[i]= fileReader.next();
			calif[i]=fileReader.nextFloat();
		}
	}
	
	public void imprimeDatos(){
		System.out.println("Alumnos: "+alumno.length);
		for(int i=0; i<alumno.length; i++){
			System.out.println(alumno[i] + "-->");
			System.out.println(calif[i]);
		}
	}
	//método que muestre los alumnos aprobados(>8)
	public void aprobados(){
		System.out.println("Alumnos aprobados");
		for(int i=0; i<alumno.length; i++){
		if (calif[i] >=8){
			System.out.println(alumno[i]);
		}
		}
	}
	
	//método que muestre los alumnos aprobados(>8)
	public void reprobados(){
		System.out.println("Alumnos reprobados");
		for(int i=0; i<alumno.length; i++){
		if (calif[i]<8){
			System.out.println(alumno[i]);
		}
		}
	}
	
	
	public void definirArreglo2(){
		System.out.println("Cuantos alumnos hay?");
		Scanner lector = new Scanner(System.in);
		int tam = lector.nextInt();
		alumno = new String[tam];
		calif = new float[tam];
		for(int i= 0; i<alumno.length; i++){
			System.out.println("Nombre");
			alumno[i]= lector.next();
			System.out.println("Calificacion");
			calif[i]=lector.nextFloat();
		}
	}
	
	public void define_mayor(){
		float mayor= calif[0];
		int elementoMayor = 0;
		for(int i=0; i<calif.length; i++){
			if(calif[i]>mayor){
				mayor = calif[i];
				elementoMayor = i;
			}
		}
		System.out.println("Alumno con mayor calificación: ");
		System.out.print(alumno[elementoMayor]+ " con calificación ");
		System.out.print(" de "+calif[elementoMayor]);
	}
	
	public void define_menor(){
		float menor= calif[0];
		int elementoMenor = 0;
		for(int i=0; i<calif.length; i++){
			if(calif[i]<menor){
				menor = calif[i];
				elementoMenor = i;
			}
		}
		System.out.println("Alumno con menor calificación: ");
		System.out.print(alumno[elementoMenor]+ " con calificación ");
		System.out.print(" de "+calif[elementoMenor]);
	}
	
	public static void main(String[] args) {
		Arreglo01 obj = new Arreglo01();
		obj.definirArreglo();
		obj.recorrerArreglo();
		obj.imprimeDatos();
		obj.aprobados();
		obj.reprobados();
		obj.define_mayor();
		obj.define_menor();
	}
	
	/*public static void main(String[] args) {
		Arreglo01 obj = new Arreglo01();
		obj.definirArreglo2();
		obj.imprimeDatos();
	}*/

}
