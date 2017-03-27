/**
 * 
 */
package source;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Environment env = null;
		ArrayList<Rover> rovers = new ArrayList<>();
		ArrayList<Task> tasks = new ArrayList<>();
		
		FileReader.readFile("input.txt", env, rovers, tasks);
		
		String xx = "";
	}

}