package gof;

//Singleton Apressado

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		
		public static SingletonLazyHolder instanciaSingleton = new SingletonLazyHolder();
	}
		
		// construtor privado garante que so ele acessa
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getInstancia() {
			return InstanceHolder.instanciaSingleton;
		}
}