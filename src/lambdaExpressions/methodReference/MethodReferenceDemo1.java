package lambdaExpressions.methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author mitrabhanu
 * @created 27-Feb-2025
 */
public class MethodReferenceDemo1 {
//Method references allow us to refer to a method without invokinq it,making our code cleaner and more readable. They can be used in place of a lambda expression when the lambda expression only calls an existing method. (::)
	public static void print(String s) {
		System.out.println(s);
	}

	public void hello(String h) {
		System.out.println(h);
	}

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Alice", "Bob", "Charlie");
		students.forEach(s -> System.out.println(s));
		// or,
		students.forEach(MethodReferenceDemo1::print);

		List<String> parents = Arrays.asList("Ryan", "Jack", "Haely");
		MethodReferenceDemo1 ob = new MethodReferenceDemo1();
		parents.forEach(ob::hello);
	}

}
