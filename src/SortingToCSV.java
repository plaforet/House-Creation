import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SortingToCSV {
	/* Takes first line of Students.csv, adds House column, and 
	 * appends that to the first row of Houses.csv file. Adds each
	 * line of Students.csv to Houses.csv, with an additional column
	 * indicating a random teacher from the teachers array.
	 */
	public static void createCSV(String[] teachers) {
		try {
			Scanner s = new Scanner(new File("Students.csv"));
			FileWriter houses = new FileWriter("Houses.csv");
			houses.append(s.nextLine() + ",House\n");
			while (s.hasNextLine()) {

				int teacher = (int) (Math.random() * teachers.length);
				houses.append(
						s.nextLine() + "," + teachers[teacher] + "\n");
			}
			houses.close();
			s.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
