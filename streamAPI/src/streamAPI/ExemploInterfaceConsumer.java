package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploInterfaceConsumer {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9);

		// aqui estou declarando o metodo e esse metodo poderia ser passado como
		// parametro na minha linha 20
		Consumer<Integer> imprimirPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};

		// note que abaixo estou passando como parametro do meu for each uma expressao
		// lambda, posso ou nao colocar o termo Stream na frente do forEach
		numeros.forEach(t -> {
			if (t % 2 == 0) {
				System.out.println(t);
			}
		});
	}
}
