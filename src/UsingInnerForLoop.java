import java.util.ArrayList;

public class UsingInnerForLoop {

	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("ABC");
		lst.add("ABC");
		lst.add("ABCD");
		lst.add("ABCD");
		lst.add("ABCE");
		//ArrayList<String> lst1 = new ArrayList<String>(new HashSet(lst));
		System.out.println("Duplicates List== " + lst);
		// System.out.println("Duplicates Removed List "+lst.stream().distinct().collect(Collectors.toList()));

		/*
		 * Object[] st = lst.toArray(); for (Object s : st) { if (lst.indexOf(s)
		 * != lst.lastIndexOf(s)) { lst.remove(lst.lastIndexOf(s)); } }
		 */
		for (int i = 0; i < lst.size(); i++) {
			for (int j = i + 1; j < lst.size(); j++) {
				if (lst.get(i).equals(lst.get(j))) {
					lst.remove(j);
					j--;
				}
			}
		}
		System.out.println("Duplicates List== " + lst);
	}
}
