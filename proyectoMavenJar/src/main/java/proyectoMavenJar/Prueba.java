package proyectoMavenJar;

public class Prueba {
	public static void main (String[] args){
		Cuadrado cuadrado1 = new Cuadrado(2.5f, 2.4f);
		System.out.println("El perimetro del cuadrado es: " + cuadrado1.perimetro());
		System.out.println("El area del cuadrado es: " + cuadrado1.area());
	}

}
