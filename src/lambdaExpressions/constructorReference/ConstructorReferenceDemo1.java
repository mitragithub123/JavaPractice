package lambdaExpressions.constructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mitrabhanu
 * @created 27-Feb-2025
 */
public class ConstructorReferenceDemo1 {
// Constructor references are a special type of method reference used to refer to a constructor without invoking it. They are written using the ::new syntax and are particularly useful when working with functional interfaces that match the signature of a constructor.
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
		students.forEach(System.out::println);
		// or,
		List<Student> students1 = names.stream().map(Student::new).collect(Collectors.toList());
		students1.forEach(System.out::println);

	}

}
