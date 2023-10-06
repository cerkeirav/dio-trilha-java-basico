package streamAPI;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExemploInterfaceSuplier {

	public static void main(String[] args) {

		// usar o suplier com expressao lambda para fornecer uma saudacao ]
		// personalizada
		Supplier<String> saudacao = () -> "Ola, seja bem vindx";
        List<String> listaSaudacao = Stream.generate(saudacao).limit(9).toList();
        
        //abaixo estou usando omethod reference
        listaSaudacao.forEach(System.out::println);
	}

}
