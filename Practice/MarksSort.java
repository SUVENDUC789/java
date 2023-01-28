import java.util.*;

class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString()
	{
		return this.rollno + " " + this.name + " "
			+ this.address;
	}
}

class SortbyName implements Comparator<Student> {
	public int compare(Student a, Student b)
	{
		return a.name.compareTo(b.name);
	}
}


class Suvendu {

	public static void main(String[] args)
	{
		Student[] arr
			= { new Student(111, "bbbb", "london"),
				new Student(131, "aaaa", "nyc"),
				new Student(121, "cccc", "jaipur") };

		System.out.println("Unsorted");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, new SortbyName());

		System.out.println("\nSorted by rollno");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
