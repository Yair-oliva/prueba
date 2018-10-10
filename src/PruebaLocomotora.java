
public class PruebaLocomotora {

	public static void main(String[]args) {
		
		Vagon v=new Vagon("A2909","El mejor","ford",10000,289);
		Vagon v1=new Vagon("A7899","El abuelo","renault",20000,2289);
		Vagon v2=new Vagon("A1002","El mellizo","wolswagen",3000,789);
		Locomotora L=new Locomotora("L2828",2);
		
		System.out.println(v.getIdentificadorDeVagon());
		System.out.println(v1.getIdentificadorDeVagon());
		System.out.println(v2.toString());
		
		
		System.out.println("El promedio de peso de carga de los vagones es de :"+L.calcularPromedioPesoDeCarga());
		
	

	}
}
