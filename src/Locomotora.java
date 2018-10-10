import java.util.Scanner;
public class Locomotora {
	private Vagon vagones[];
	private String identificadorLocomotora;
	
	public Locomotora(String identificadorLocomotora, int cantidadDeVagones) {
		this.identificadorLocomotora=identificadorLocomotora;
		this.vagones=new Vagon[cantidadDeVagones];
		this.vagones=cargarVagones(cantidadDeVagones);
		
	}


	public Vagon[] cargarVagones(int cantidadDeVagones) {
		Vagon [] vagonesAux=new Vagon[cantidadDeVagones];
		Scanner teclado=new Scanner(System.in);
		String identificadorDeVagon="";
		String descripcion="";
		String marca="";
		int pesoMaximoQueSoporta=0;
		int pesoDeCarga=0;
		for(int i=0;i<vagonesAux.length;i++) {
		boolean verificadorDeVagon=true;
		do {
			System.out.print("Ingrese el ID del vagon en que se ubica en la posicion "+(i+1)+" :");
			identificadorDeVagon=teclado.next();
			verificadorDeVagon=Locomotora.verificadorDeVagon(identificadorDeVagon);
		}while(!verificadorDeVagon);
		System.out.print("Ingrese la descripcion del vagon "+(i+1)+" : ");
		descripcion=teclado.next();
		System.out.print("Ingrese la marca del vagon "+(i+1)+" : ");
		marca=teclado.next();
		System.out.print("Ingrese el peso maximo que soporta el vagon "+(i+1)+" : ");
		pesoMaximoQueSoporta=teclado.nextInt();
		System.out.print("Ingrese el peso de carga del vagon "+(i+1)+" : ");
		pesoDeCarga=teclado.nextInt();
		
		vagonesAux[i]= new Vagon(identificadorDeVagon,descripcion,marca,pesoMaximoQueSoporta,pesoDeCarga);
		
		}
		return vagonesAux;
	}
	
	public static boolean verificadorDeVagon(String identificadorDeVagon) {
		boolean esCorrectoElVagon=true;
		for(int i=0;i<identificadorDeVagon.length();i++) {
			if(identificadorDeVagon.charAt(0)=='A') {
				esCorrectoElVagon=true;
			}
			else {
				esCorrectoElVagon=false;
			}
		}
		return esCorrectoElVagon;
	}
	public void setVagones(Vagon vagones[]) {
		this.vagones=vagones;
	}
	public Vagon[] getVagones() {
		return vagones;
	}
	
	public Float calcularPromedioPesoDeCarga() {
		int sumatoriaVagon=0;
		for(int i=0;i<this.vagones.length;i++) {
			sumatoriaVagon+=vagones[i].getPesoDeCarga();
		}
		
		return (float)sumatoriaVagon/Vagon.cantidadDeVagones;
	}
	
}
