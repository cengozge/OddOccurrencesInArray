import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		
		int[] A = {3,6,3,7,7,5};
		System.out.println(Arrays.toString(solution(A)));
		
	}
	
	public static Object[] solution(int[] A) {
        // write your code in Java SE 8
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			int occurrence = 1;
			
			if(!map.containsKey(A[i]))
			{
				map.put(A[i], occurrence);
			}
			else{
				map.replace(A[i], ++occurrence);
			}
		}
		
		Stream<Integer> s = map.entrySet()
        .stream()
        .filter( e -> e.getValue() == 1)
        .map(Map.Entry::getKey);
		
		return s.toArray();
    }

}
