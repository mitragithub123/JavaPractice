package streamsAPI.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Count
		long evenCount = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println("Even count: " + evenCount);

		// Min
		Optional<Integer> min = list.stream().min((a, b) -> {
			return a.compareTo(b);
		});
		System.out.println("Minimum value: " + min.get());

		// Max
		Optional<Integer> max = list.stream().max((a, b) -> {
			return a.compareTo(b);
		});
		System.out.println("Maximum value: " + max.get());

	}

}
