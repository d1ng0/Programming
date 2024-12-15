// Has insulin receptor, glucose channel.
package GlycemiaSubclasses;

// class declaration
class Cell {

	int glucose;
	boolean insulinReceptor;

	public Cell(int glu, boolean insulinRec) {
		glucose = glu;
		insulinReceptor = insulinRec;
	}

	// Require main method to compile
	public static void main(String[] args){
		System.out.println("Cell...");
	}
}
