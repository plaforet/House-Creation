import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortingToArrayLists {
	public static ArrayList<String> StudentList = new ArrayList<String>();
	public static int rando = 0;
	private static Random rand = new Random();

	// Prints lead teacher's name and their students
	public static void printList(ArrayList<String> list, String teacher) {
		System.out.println(teacher + ":");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	// Randomly add student to a teacher's list and remove them from StudentList
	public static void AddToList(ArrayList<String> list) {
		rando = rand.nextInt(StudentList.size());
		list.add(StudentList.get(rando));
		StudentList.remove(rando);
	}

	// Creates master ArrayList StudentList, adds each student to a teacher list.
	public static void populateLists(File f) {
		ArrayList<String> BrozList = new ArrayList<String>();
		ArrayList<String> GarzaList = new ArrayList<String>();
		ArrayList<String> JordanList = new ArrayList<String>();
		ArrayList<String> WalkerList = new ArrayList<String>();

		try {
			Scanner s = new Scanner(f);

			while (s.hasNextLine()) {
				StudentList.add(s.nextLine());
			}

			while (StudentList.size() / 4 > 0) {
				AddToList(BrozList);
				AddToList(GarzaList);
				AddToList(JordanList);
				AddToList(WalkerList);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		printList(BrozList, "Broz");
		printList(GarzaList, "Garza");
		printList(JordanList, "Jordan");
		printList(WalkerList, "Walker");
	}

}
