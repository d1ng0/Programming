/* This program demonstrates class declaration and access control principles,
* and includes instances of Cell, Glucose, and Insulin classes. Glycemia is the superclass. */

class Glycemia {
	public static void main(String[] args) {
		// create instance of Cell
		Cell cell1 = new Cell(5,false);
		System.out.println("Glucose: " + cell1.glucose);
		System.out.println("Insulin Receptor (open?): " + cell1.insulinReceptor);
		// create instance of Glucose
		// create instance of Insulin
	}
}
