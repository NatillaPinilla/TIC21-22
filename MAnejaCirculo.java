package MiCodigo;

public class MAnejaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo miCirculito;
		miCirculito=new Circulo(10.0,3.0,4.0);
		System.out.print("El circulo de radio ");
		System.out.println(miCirculito.getRadio());
		System.out.println("AREA: ");
		System.out.println(miCirculito.devuelveArea());
		System.out.println(miCirculito.getCoordenadaCentroX());
		System.out.println(miCirculito.getCoordenadaCentroY());
	}

}