package gof;

//Singleton Preguicoso

public class SingletonJava {
	private static SingletonJava instanciaSingleton;
	
	
	//construtor privado garante que so ele acessa
	private SingletonJava() {
		super();
	}
	
	public static SingletonJava getInstancia() {
		if(instanciaSingleton == null) {
			instanciaSingleton = new SingletonJava();
		}
		return instanciaSingleton;
	}
}
