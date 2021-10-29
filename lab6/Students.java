package lab6;
import java.util.HashMap;
import java.util.Set;

public class Students {
	public static HashMap<String, String> getStudent(HashMap<String, Integer> stu) {
		HashMap<String, String> Medal = new HashMap<>();
		Set<String> set = stu.keySet();
		for (String s : set) {
			Integer marks = stu.get(s);
			if (marks >= 90) {
				Medal.put(s, "Gold");
			} else if (marks >= 80 && marks < 90) {
				Medal.put(s, "Silver");
			} else if (marks >= 70 && marks < 80) {
				Medal.put(s, "Bronze");
			}
		}
		return Medal;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> student = new HashMap<>();
		Students sc = new Students();

		student.put("Ajay:", 89);
		student.put("Bharath:", 95);
		student.put("Prasanth:", 85);
		student.put("Rahul:", 85);
		student.put("Nikhil:", 70);
		System.out.println(sc.getStudent(student));

	}

}
