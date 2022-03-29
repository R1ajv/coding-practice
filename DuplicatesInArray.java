public class DuplicatesInArray{
public static void main(String[] args){
List<Integer> number = Arrays.asList(1,2,3,3,4,4,5,6,6,7,7,7,7,8);
		Map<Integer, Long> duplicates =number
		.stream()
		.collect(Collectors.groupingBy(Integer::intValue , Collectors.counting()));
		System.out.println(duplicates);
}
}