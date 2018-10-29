import java.util.Scanner;

public class MorseTreeMain {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		MorseTree myTree = new MorseTree();

		myTree.add("A",".-");
		myTree.add("B","-...");
		myTree.add("C","-.-.");
		myTree.add("D","-..");
		myTree.add("E",".");
		myTree.add("F","..-.");
		myTree.add("G","--.");
		myTree.add("H","....");
		myTree.add("I","..");
		myTree.add("J",".---");
		myTree.add("K","-.-");
		myTree.add("L",".-..");
		myTree.add("M","--");
		myTree.add("N","-.");
		myTree.add("O","---");
		myTree.add("P",".--.");
		myTree.add("Q","--.-");
		myTree.add("R",".-.");
		myTree.add("S","...");
		myTree.add("T","-");
		myTree.add("U","..-");
		myTree.add("V","...-");
		myTree.add("W",".--");
		myTree.add("X","-..-");
		myTree.add("Y","-.--");
		myTree.add("Z","--..");

		System.out.print("Put _ after each letter or put __ for space and put # to end \nExample (...__---__...#)"
				+ "\nEnter the Morse Code: ");
		String nodes = keyboard.nextLine();
		System.out.print(myTree.decode(nodes));
    }
}
