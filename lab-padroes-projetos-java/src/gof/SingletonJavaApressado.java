package gof;

//Singleton Apressado

public class SingletonJavaApressado {
	
private static SingletonJavaApressado instanciaSingleton = new SingletonJavaApressado();
	

	//construtor privado garante que so ele acessa
	private SingletonJavaApressado() {
		super();
	}
	
	public static SingletonJavaApressado getInstancia() {
		return instanciaSingleton;
	}
}