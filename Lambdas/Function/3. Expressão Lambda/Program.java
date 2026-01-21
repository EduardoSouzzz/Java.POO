package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

    Function<Product, String> func = p -> p.getName().toUpperCase();

    List<String> names = list.stream().map(func).collect(Collectors.toList();
    // stream() = obter uma stream na list
    // map = aplica uma função a cada elemento da stream, 
    // gerando uma nova stream com os elemento novos ou transformados
    
		names.forEach(System.out::println);
	}
}
