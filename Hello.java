import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(234);
		list.add(345);
		list.add(456);
		list.add(459);
		list.add(4575);
		list.add(62);
		list.add(4575);
		list.add(62);
		System.out.println(list);
		List <Integer> al = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(al);
		
		Set<Integer> al2 = list.stream().filter(x->x>500).collect(Collectors.toSet());
		System.out.println(al2);
		
		Set<Integer> al3 = list.stream().map(x->x+5).collect(Collectors.toSet());
		System.out.println(al3);
		System.out.println(al3.stream().count());

	}

}
