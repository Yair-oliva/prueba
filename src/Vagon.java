
public class Vagon {
	 private String identificadorDeVagon = " ";
	 private String descripcion= " ";
	 private String marca = " ";
	 private int pesoMaximoQueSoporta=0;
	 private int pesoDeCarga=0;
	 public static int cantidadDeVagones;
	 
	 public Vagon(String identificadorDeVagon,String descripcion,String marca,int pesoMaximoQueSoporta,int pesoDeCarga) {
		 this.identificadorDeVagon=identificadorDeVagon;
		 this.descripcion=descripcion;
		 this.marca=marca;
		 this.pesoMaximoQueSoporta=pesoMaximoQueSoporta;
		 this.pesoDeCarga=pesoDeCarga;
		 Vagon.cantidadDeVagones++;
	 }
	 public Vagon(String identificadorDeVagon,String marca,int pesoMaximoQueSoporta) {
		 this.identificadorDeVagon=identificadorDeVagon;
		 this.marca=marca;
		 this.pesoMaximoQueSoporta=pesoMaximoQueSoporta;
		 this.pesoDeCarga=0;
		 Vagon.cantidadDeVagones++;
	 }
	 public static int getCantidadDeVagones(int cantidadDeVagones) {
		 return cantidadDeVagones;
	 }
	 public void setIdentificadorDeVagon(String identificadorDeVagon) {
		 this.identificadorDeVagon=identificadorDeVagon;
	 }
	 public void setPesoDeCarga(int pesoDeCarga) {
		 this.pesoDeCarga=pesoDeCarga;
	 }
	 public String getIdentificadorDeVagon() {
		 return identificadorDeVagon;
	 }
	 public int getPesoDeCarga() {
		 return pesoDeCarga;
	 }
	 public String toString() {
		 return "El identificador es"+this.identificadorDeVagon+" la descripcion es "+this.descripcion+" la marca del vagon "+this.marca+" tiene como peso maximo "+this.pesoMaximoQueSoporta+" y el vagon lleva cargado "+this.pesoDeCarga;
	 }
	 
}
